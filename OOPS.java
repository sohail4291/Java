// class Vehicle{
//   protected  int  speed;
// }

// class Bike extends Vehicle{
//     void setSpeed(int s){
//         speed = s;
//     }
//     int getSpeed(){
//         return speed;
//     }
// }

// pass by value
// class Example1{
//     static void changeNum(int n){
//         n = 100;
//         System.out.println(n);
//     }
// }
// public class OOPS{
//     public static void main(String[] args){
//     int n = 50;
//     Example1.changeNum(n);
//     System.out.println(n);

        
//     }
// }


// pass by reference 
// java is commpletly a pass by value  but object reference.
// class Person{
//     String name;
// }
// class Example2{
//     static void changeName(Person p){
//        // p = new Person();
//         p.name = "Sohail";
//         System.out.println("new name "+ p.name);
//     }
// }
// public class OOPS{
//     public static void main(String[] args){
//         Person p = new Person();
//         p.name = "ALi";
//         System.out.println("old name :"+p.name);
//         Example2.changeName(p);
//         System.out.println("new name : "+p.name);
//     }
// }


// interface TestInterface{
//     static  int a = 10; 
//     static void display(){
//         System.out.println("hello");
//     }
// }

// public class OOPS implements TestInterface{
//     public static void main(String[] args){
//         main("Sohail");
//         System.out.println(TestInterface.a);
//     }
//     public static void main(String name){
//         System.out.println(name);
//     }
// }








// import java.util.*;
// // Document class for demonstration
// class Document {
//     private String content;

//     public Document(String content) {
//         this.content = content;
//     }

//     public String getContent() {
//         return content;
//     }
// }

// interface Printable {
//     void print(Document doc);
// }

// // Concrete implementation of Printable
// class PDFPrinter implements Printable {
//     @Override
//     public void print(Document doc) {
//         System.out.println("Printing PDF: " + doc.getContent());
//     }
// }
// class InkjetPrinter implements Printable {
//     @Override
//     public void print(Document doc) {
//         System.out.println("Printing via Inkjet: " + doc.getContent());
//     }
// }
// public class OOPS{
//     public static void main(String[] args){
//         int a = 10;
//         main(a);
//         Document d = new Document("THis is a string");
//         PDFPrinter p = new PDFPrinter();
//         p.print(d);
//         InkjetPrinter i = new InkjetPrinter();
//         i.print(d);


//     }
//     public static void main(int a){
//         System.out.println("Hello world" + a);
//     }
// }



// class Developer{
//     private Team team;
//     public void setTeam(Team team){
//         this.team = team;
//     }
// }

// class Team{
//     private List<Integer> developers = new ArrayList<>();
//     public void addDeveloper(Developer dev){
//         developers.add(dev);
//         dev.setTeam(this);
//     }
// }

// class OOPS{
//     public static void main(String[] args){
//         Developer a = new Developer();
//         a.setTeam("IT");
//         Team t = new Team();
//         t.add(a);
//     }
// }
