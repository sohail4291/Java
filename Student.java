// public class Object {
//     int id;
//     Object(int id){
//         this.id  = id;
//     }

//     public boolean equals(Object o){
//         Object s = (Object) o;
//         return this.id == s.id;
//     }
//     public static void main(String[] args){
//         Object o1 = new Object(1);
//         Object o2 = new Object(1);
//         System.out.println(o1.equals(o2));
//         System.out.println(o1.getClass().getName());
//     }
// }





// class Address {
//     String city;
//     Address(String city) {
//         this.city = city;
//     }
// }

// class Student implements Cloneable {
//     int id;
//     Address address;

//     Student(int id, Address address) {
//         this.id = id;
//         this.address = address;
//     }

//     public Object clone() throws CloneNotSupportedException {
//         return super.clone(); // shallow copy
//     }

//     public static void main(String[] args) throws Exception {
//         Address a1 = new Address("Hyderabad");
//         Student s1 = new Student(1, a1);
//         Student s2 = (Student) s1.clone();

//         s2.address.city = "Bangalore";

//         System.out.println(s1.address.city); // Bangalore
//         System.out.println(s2.address.city); // Bangalore
//     }
// }


// class Address implements Cloneable {
//     String city;
//     Address(String city) {
//         this.city = city;
//     }

//     public Object clone() throws CloneNotSupportedException {
//         return super.clone();
//     }
// }

// class Student implements Cloneable {
//     int id;
//     Address address;

//     Student(int id, Address address) {
//         this.id = id;
//         this.address = address;
//     }

//     public Object clone() throws CloneNotSupportedException {
//         Student s = (Student) super.clone();
//         s.address = (Address) address.clone(); // deep copy
//         return s;
//     }

//     public static void main(String[] args) throws Exception {
//         Address a1 = new Address("Hyderabad");
//         Student s1 = new Student(1, a1);
//         Student s2 = (Student) s1.clone();

//         s2.address.city = "Bangalore";

//         System.out.println(s1.address.city); // Hyderabad
//         System.out.println(s2.address.city); // Bangalore
//     }
// }



// public class Student implements Cloneable {
//     int id;

//     Student(int id) {
//         this.id = id;
//     }

//     public Object clone() throws CloneNotSupportedException {
//         return super.clone();
//     }

//     public static void main(String[] args) throws CloneNotSupportedException {
//         Student s1 = new Student(10);
//         Student s2 = (Student) s1.clone();
//         System.out.println(s2.id);
//     }
// }



interface square{
    int calculate(int a);
}
public class Student{
    // public int calculate(int a){
    //     return a*a;
    // }
    public static void main(String[] args){
        // Student s = new Student();
        // int b = s.calculate(3);   
        // System.out.println(b);

        // second method
        int a = 10;
        square s = (int x) -> x * x;
        int b = s.calculate(a);
        System.out.println(b);
    }
}