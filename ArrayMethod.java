import java.util.*;
// class Student implements Comparable<Student>{
//     int age;
//     String name;
//     Student(int age, String name){
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public int compareTo(Student s){
//         return this.age - s.age;
//     }
//     public String toString(){
//         return name + " "+age;
//     }

// }

// class Student {
//     int age;
//     String name;
//     Student(int age, String name){
//         this.age = age;
//         this.name = name;
//     }
//     public String toString(){
//         return name + " "+age;
//     }
// }

// class NameComparator implements Comparator<Student>{
//     public int compare(Student s, Student s2){
//         return s.age - s2.age;
//     }
// }

// public class ArrayMethods {
//     public static void main(String[] args){
//         List<Student> list = new ArrayList<>();
//         list.add(new Student(30,"sam"));
//         list.add(new Student(20,"sohail"));
//         list.add(new Student(10,"john"));
//         Collections.sort(list, new NameComparator().reversed());

//         System.out.println(list);
//     }
    
// }




public class ArrayMethod
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    ArrayMethod()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ArrayMethod(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ArrayMethod(int x, int y)
    {
        System.out.println(x * y);
    }

    public static void main(String args[])
    {
        // invokes default constructor first
        ArrayMethod a = new ArrayMethod();
    }
}