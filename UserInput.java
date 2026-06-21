
// import java.io.FileNotFoundException;

// public class UserInput{
//     private class RunnableImpl implements Runnable{
//         public void run(){
//             System.out.println(Thread.currentThread().getName());
//             try {
//                 throw new FileNotFoundException();
//             }
//             catch(FileNotFoundException e){
//                 System.out.println("must catch here");
//                 e.printStackTrace();
//             }
//             int r = 1/0;
//         }

//     }
//     public static void main(String[] args){
//         Thread t = new Thread(new UserInput().new RunnableImpl());
//         t.start();
//     }

// }

// import java.util.*;

// class Student{
//     int rollno;
//     String name;
//     Student(int rollno,String name){
//         this.rollno = rollno;
//         this.name = name;
//     }
//     @Override
//     public String toString(){
//         return rollno + " " + name;
//     }

// }

// class Sortbyrollno implements Comparator<Student>{
//     public int compare(Student a, Student b){
//         return  a.rollno - b.rollno;
//     }
// }

// class Sortbyname implements Comparator<Student>{
//     public int compare(Student a , Student b){
//         return a.name.compareTo(b.name);
//     }
// }

// public class UserInput{
//     public static void main(String[] args){
//         List <Student> students = new ArrayList<>();
//         students.add(new Student(10,"sohail"));
//         students.add(new Student(11,"Samir"));
//         students.add(new Student(16,"Danny"));
//         students.add(new Student(15,"abc"));
        
//         // for(Student a : students){
//         //     System.out.println(a);
//         // }

//         // Collections.sort(students,new Sortbyrollno());
//         Collections.sort(students,(a,b)-> a.rollno - b.rollno);

//         for(Student s : students){
//             System.out.println(s);
//         }
//     }
// }

// @FunctionalInterface
// interface Square{
//     int calculate(int x);
// }
// public class UserInput{
//     public static void main(String[] args){
//         int a = 4;
//         Square s = (int x) -> x*x;
//         int b =s.calculate(a);
//         System.out.println(b);
//     }
// }

// interface Serializable{

// }
// class Person implements Serializable{
//     public Person(){
//         System.out.println("Person class");
//     }
// }
// class Animal{
//     public Animal(){
//         System.out.println("Animal Class");
//     }
// }
// public class UserInput{
//     public static void main(String[] args){
//         Person p = new Person();
//         Animal a = new Animal();
//         if(p instanceof Serializable){
//             System.out.println("serializable");
//         }
//         else{
//             System.out.println("non serializable");
//         }
//         if(a instanceof Serializable){
//             System.out.println("serializable");
//         }
//         else{
//             System.out.println("non serailizable");
//         }
//     }
// }
class Student implements Cloneable{
    int i;
    public Student(int i){
        this.i = i;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class UserInput{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s = new Student(10);
        Student b = (Student)s.clone();
        System.out.println(b.i);

    }
}