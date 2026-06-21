
// public class Arrays{
//     public static void main(String[] args){
//         int[] arr = java.util.stream.IntStream.range(1,5).toArray();
//         int[] arr2 = java.util.stream.IntStream.rangeClosed(1,5).toArray();
//         int[] arr3 = java.util.stream.IntStream.of(1,2,3,4).toArray();
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         for(int i=0;i<arr2.length;i++){
//             System.out.print(arr2[i]+" ");
//         }
//         for(int i=0;i<arr3.length;i++){
//             System.out.print(arr3[i]+" ");
//         }
//     }
// }


// Arrays.asList(); // address represtation
// Arrays.binarySerch(arr,1,3,key) 
// Arrays.compare(arr1,arr2); compare to int arraysf
// Integer.compare(arr,arr2) compares to objects
// Arrays.toString(arr) // creates new string in string pool
// Array.copyOf(newarray,length) //copies elem form old and not effected
// Arrays.deepEquals(arr1,arr2); it will apply to obj and 2d arrays
// hashCode for array[] 1d
// deepHashCode for 2d array 
// deep.toString() for 2d array
// equals
// fill(original,key)
// mismatch(arr,arr2) first no index


// import java.util.Arrays;

// public class ArraysClass{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5};
       
//         System.out.println(Arrays.asList(arr));
//         System.out.println(Arrays.binarySearch(arr,10));
//         System.out.println(Arrays.binarySearch(arr,2,3,5));
//         System.out.println("");
//     }
// }



// import java.util.Arrays;
// public class ArraysClass{
//     public static void main(String[] args){

//         int[][] s = {{1,2,3}};
//         int[][] s1 = {{1,2,3}};
//         // System.out.println(Arrays.compare(s,s1));

//         // System.out.println(Arrays.compare(s,s1));
        
//         // System.out.println(Arrays.toString(s)); // does not modify obj return a new 
//         //string in string pool

//         // System.out.println(Arrays.toString(Arrays.copyOf(s,10)));

//         // System.out.println(Arrays.toString(Arrays.copyOfRange(s1,1,2)));
//         // System.out.println(Arrays.deepEquals(s1,s));
//         // System.out.println(Arrays.hashCode(s));
//         System.out.println(Arrays.deepEquals(s,s1));
//     }
// }


// public class ArraysClass{
//     public static void main(String[] args){
//         byte[] arr= { 65,66,67};
//         String s = new String(arr);
//         System.out.println(s);
//         String s1 = "AAA";
//         String s2 = "AAA";
//         System.out.println(s1+" "+s2);
//         s2 = "SSS";
//         System.out.println(s1+ " "+ s2);
//     }
// }


// class Service{
//     public void doSomething(){
//         System.out.println("do somehting");
//     }
// }
// public class Arrays{
//     public Service service;
//     public Arrays(Service service){
//         this.service = service;
//     }
//     public void handleRequest(){
//         service.doSomething();
//     }
//     public static void main(String[] args){
//         Service s = new Service();
//         Arrays a = new Arrays(s);
//         a.handleRequest();
//     }
// }

// without dependency injection
//  class Service{
//     public void doSomething(){
//         System.out.println("hi sohail");
//     }
// }
// public class Arrays{
//     public Service service;
//     public void hadleRequest(){
//         service.doSomething();
//     }
//     public static void main(String[] args){
       

//     }

// }

// class Arrays{
//     public static void main(String[] args){
//         int a = 2321;
//         // int count = 0;
//         // while(a > 0){
//         //     count += 1;
//         //     a = a/10;
            
//         // }
//        // int count = (int)(Math.log10(a)+1);

//        String count = Integer.toString(a);
//        int b = count.length();
//         System.out.println("count  : "+b);
//     }
// }


// public class Arrays {
//     public int reverse(int x) {
//         int rev =0;
//         int rem;
//        int sign = x > 0 ? 1 : -1;
//         x = Math.abs(x);
//         while(x > 0){
//             rem = x % 10;
//             rev = rev*10 + rem ;
//             x = x / 10;
//         }
//         return rev*sign;
//     }

//     public static void main(String[] args){
//         Arrays a = new Arrays();
//         int b = a.reverse(-123);
//         System.out.println(b);
//     }
// }

// public class Arrays {
//     public boolean reverse(int x) {
//         int len = (x+1)/2;
//     }

//     public static void main(String[] args){
//         Arrays a = new Arrays();
        
// }

// public class Arrays{
//     static int GCD(int a , int b){
//         int result  = Math.min(a,b);
//         while(result > 0){
//             if(a % result == 0 && b % result ==0){
//                 break;
//             }
//             result--;
//         }
//         return result;
//     }

//     static int GCD2(int a, int b){
//         if(a == 0){
//             return b;
//         }
//         if(b == 0){
//             return a;
//         }
//        if(a > b){
//             return GCD2(a-b,b);
//        }
//        return GCD2(a,b-a);
//     }

//     static int GCD3(int a,int b){
//         if(a ==0){
//             return b;
//         }
//         if(b == 0){
//             return a;
//         }
//         if(a > b){
//             if(a % b ==0){
//                 return b;
//             }
//             return GCD3(a-b,b);
//         }
//         if(b % a == 0){
//             return a;
//         }
//         return GCD3(a,b-a);
//     }


//     static int GCD4(int a ,int b){
//         return (b == 0) ? a : GCD4(a, a % b);
//     }

//     static int LCM(int a, int b){
//         int s = Math.min(a,b);
//         int g = Math.max(a,b);
//         for(int i =g;i< s*g;i = i+g){
//             if(i % s ==0){
//                 return i;
//             }
//         }
//         return a*b;
//     }

//     static int LCM2(int a , int b){
//         return (b == 0 )? a : LCM2(b, a%b);
//     }
//     static int LCM3(int a ,int b){
//         return (a / LCM2(a,b)) * b;
//     }
//     public static void main(String[] args){
//         System.out.println("hello world");
//         int a = 10; 
//         int b = 20;
//         System.out.println(GCD(a,b));
//         System.out.println(GCD2(a,b));
//         System.out.println(GCD3(a,b));
//         System.out.println(GCD4(a,b));
//         System.out.println(LCM(a,b));
//         System.out.println(LCM3(a,b));


//     }
// }



// class Arrays{
//     static int closestNumber(int n, int m) {
//         // find the quotient
//         int closest = 0;
//         int minDifference = Integer.MAX_VALUE;

//         // Check numbers around n
//         for (int i = n - Math.abs(m); i <= n + Math.abs(m); ++i) {
//             if (i % m == 0) {
//                 int difference = Math.abs(n - i);

//                 if (difference < minDifference || 
//                    (difference == minDifference && Math.abs(i) > Math.abs(closest))) {
//                     closest = i;
//                     minDifference = difference;
//                 }
//             }
//         }
//         return closest;
//     }

//     public static void main(String[] args) {
//         int n = 14, m = 4;
//         System.out.println(closestNumber(n, m));
//     }
// }


// public class Arrays{
//     public static void main(String[] args){
//         System.out.println("hello world");
//         String a =  "{
//                         "id": 101,
//                         "name": "Sohail",
//                         "active": true
//                         }";

//         ObjectMapper obj = new ObjectMapper();
//         obj.readValue(a);


//     }
// }




// class Burger{
    
//     private boolean cheese;
//     private boolean extraPatty;
//     private boolean sauce;
    
    
//     private Burger(Builder builder){
        
//         this.cheese = builder.cheese;
//         this.extraPatty = builder.extraPatty;
//         this.sauce =  builder.sauce;
       
//     }
    
//     public static class Builder{
        
//         private boolean cheese;
//         private boolean extraPatty;
//         private boolean sauce;
        
        
//         private Builder addCheese(){
//             this.cheese = true;
//             return this;
            
//         }
        
        
//         public Builder addExtraPatty(){
//             this.extraPatty = true;
//             return this;
//         }
        
//         public Builder addSauce(){
//             this.sauce = true;
//             return this;
//         }
        
    
     
        
//         public Burger build(){
//             return new Burger(this);
//         }
        
//     }
//         @Override

//         public String toString(){
//             return "[ cheese =" + cheese + ", extraPatty = " + extraPatty + " sauce = " + sauce + " ]";
//         }
        
        
        
        
    
    
    
// }

// public class Arrays{
//     public static void main(String[] args){
//         Burger burger = new Burger.Builder()
//                             .addExtraPatty()
//                             .build();
                            
//         System.out.println(burger);
//     }
// }


// class Burger {
//     private boolean cheese;
//     private boolean extraPatty;
//     private boolean sauce;

//     // private constructor
//     private Burger(Builder builder) {
//         this.cheese = builder.cheese;
//         this.extraPatty = builder.extraPatty;
//         this.sauce = builder.sauce;
//     }

//     // Builder inner class
//     public static class Builder {
//         private boolean cheese;
//         private boolean extraPatty;
//         private boolean sauce;

//         public Builder addCheese() {
//             this.cheese = true;
//             return this; // return builder for chaining
//         }

//         public Builder addExtraPatty() {
//             this.extraPatty = true;
//             return this;
//         }

//         public Builder addSauce() {
//             this.sauce = true;
//             return this;
//         }

//         public Burger build() {
//             return new Burger(this);
//         }
//     }

//     @Override
//     public String toString() {
//         return "Burger [cheese=" + cheese + ", extraPatty=" + extraPatty + ", sauce=" + sauce + "]";
//     }
// }

// public class Arrays {
//     public static void main(String[] args) {
//         Burger myBurger = new Burger.Builder()
//                             .addCheese()
//                             .addSauce()
//                             .build();

//         System.out.println(myBurger);  
//         // Output: Burger [cheese=true, extraPatty=false, sauce=true]
//     }
// }



// import java.io.*;
// import java.lang.*;

// class Student implements Serializable{
//     int rollno;
//     String name;

//     public Student(int rollno , String name){
//          this.rollno = rollno;
//          this.name = name;
//     }
// }

// public class Arrays{
//     public static void main(String[] args){

//         try{
//             Student s = new Student(10, "Sohail");
//         FileOutputStream fos = new FileOutputStream("student.ser");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(s);
//         oos.close();
//         fos.close();

//         System.out.println("object serialized");
//         System.out.println( oos.writeObject(s));

//         FileInputStream fis = new FileInputStream("student.ser");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Student s1 = (Student) ois.readObject();
//         ois.close();
//         fis.close();

//         System.out.println(s1.rollno);

//         }catch(Exception e){
//             System.out.println(e.getMessage());
//         }


//     }
// }

// abcdeabc
// a = 2 , b = 2 , c = 1, f = 0
// import java.util.Scanner;
// public class Arrays{
//     public static void main(String[] args){
      
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a string : ");
//         String s = sc.next();
       
        

//         int hash[] = new int[256];
//         int n = hash.length;

//         for(int i=0;i< s.length(); i++){
//             hash[s.charAt(i)]++;    // ++ here addding the count value to 1 or 2 ..
//         }

//         for(int i=0; i<n; i++){
//             System.out.print(hash[i]+" ");
//         }
//         System.out.print( " Enter a number to know occurance : ");
//         int p = sc.nextInt();
//         while(p-- > 0){
//             char c = sc.next().charAt(0);
//             System.out.println(hash[c]);
//         }
//     }
// }


// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
        

//         // map{ 1 : 1, 5 : 2, c : 1, 12 : 4 };
//         int arr[] = { 1,2,3,3,4};

//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0; i<arr.length; i++){
//             int key = arr[i];
//             int freq = 0;
//             if(map.containsKey(key)){
//                 freq = map.get(key);            
//             }
//             freq++;
//             map.put(key, freq);
//         }

//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//             System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//     }
// }

// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         char[] arr = { 'a', 'b','a','c','d','1'};
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0; i< arr.length; i++){
//             char key = arr[i];
//             int freq= 0;
//             if(map.containsKey(key)){
//                 freq = map.get(key);
//             }
//             freq += 1;
//             map.put(key,freq);

//         }

//         for(Map.Entry<Character,Integer> i : map.entrySet()){
//             System.out.println(i.getKey()+ " "+ i.getValue());
//         }
//     }
// }
public class Arrays{
    class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
        }
    }
    private Node head;

    public void insertBegin(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertEnd(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode; 
    }

    public void insertAtPosition(int pos, int data){
       if(pos < 1){
        System.out.println(" pos must be > than 1");
        return ;
       }
       Node newnode = new Node(data);
       Node temp = head;
       for(int i=0; i< pos -1 & temp!=null; i++){
        temp = temp.next;
       }
       if(temp == null){
        System.out.println("Index out of bound.");
        return;
       }
       newnode.next = temp.next;
       temp.next = newnode;

    }
    public void display(){
         Node temp  = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
        }
    
    public void deleteBegin(){
        Node temp = head;
        if(head == null){
            return;
        }
        head = head.next;
    }
    public void deleteEnd(){
        Node temp = head;
        if(head == null){
            return;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int pos){
        if(pos < 1){
            System.out.println("pos must be > 0");
            return;
        }
        Node temp = head;
        for(int i=0; i<pos-1 && temp != null; i++){
            temp  = temp.next;
        }
        if(temp == null || temp.next == null){
            System.out.println("Index out of bound");
            return;
        }
        temp.next = temp.next.next;
    }

    public boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        return count;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void reverseList(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev  = current;
            current = next;
            
        }
        head = prev;
    }

    public static void main(String[] args){
        Arrays linklist = new Arrays();
        linklist.insertBegin(10);
        linklist.insertBegin(5);
        linklist.insertEnd(20);
        linklist.insertAtPosition(2,15);
        // linklist.deleteBegin();
        // linklist.deleteEnd();
        linklist.display();
        linklist.deleteAtPosition(2);
        linklist.display();
        boolean b = linklist.search(20);
        System.out.println(b);
        int s = linklist.size();
        System.out.println(s);
        boolean empty = linklist.isEmpty();
        System.out.println(empty);
        linklist.reverseList();
        linklist.display();

    }
}