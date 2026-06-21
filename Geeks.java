//     public static void main(String[] args) throws IOException{
//         FileInputStream f = null;
//         FileOutputStream f2 = null;
//         try{
//             f = new FileInputStream("file1.txt");
//             f2= new FileOutputStream("file2.txt");
//             int temp;
//             while((temp = f.read()) != -1){
//                 f2.write((byte)temp);
//             }
//         }
//         finally{
//             if(f != null){
//                 f.close();
//             }
//             if(f2 != null){
//                 f2.close();
//             }
//         }
//     }
// }

// import java.io.*;
// public class Geeks{
//     public static void main(String[] args) throws IOException{
//         FileReader f = null;
//         try{
//             f = new FileReader("file1.txt");
//             int temp;
//             while((temp=f.read()) != -1){
//                 System.out.println((char)temp);
//             }

//         }
//         finally{
//             System.out.println("error ::");
//             f.close();
//         }

//     }
// }

// import java.io.*;
// public class Geeks{
//     public static void main(String[] args){
//         try{
//             Reader r = new FileReader("file1.txt");
//             int temp = r.read();
//             while(temp != -1){
//                 System.out.println((char)temp);
//                 temp = r.read();
//             }
//             r.close();

//         }
//         catch(Exception e){
//             System.out.println("e -> "+e.getMessage());
//         }
//     }
// }

// // INPUT 
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class Geeks{
//     public static void main(String[] args) throws IOException{

//         BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter a Sentence : ");
//         String s = b.readLine();

//         System.out.println("\n");
//         System.out.println(s);

//          int n = s.length();
        // for(int i=0;i<n;i++){
        //     char c = s.charAt(i);
        //     System.out.println(c);
        // }
        
        // char[] a = s.toCharArray();
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }





        
        // System.out.println("\n Enter a integer : ");
        // int n = Integer.parseInt(b.readLine());

        // System.out.println("\n Enter a Char : ");
        // char c = b.readLine().charAt(0);

        // System.out.println("\n Enter a String : ");
        // String s2 = b.readLine().split(" ")[0];

        // System.out.println("\n Enter a integer array : ");
        // String[] arr = b.readLine().split(" ");
        // int[] array = new int[arr.length];
        
        
       // }
        // System.out.println(n);
        // System.out.println(c);
        // System.out.println(s2);
        
        
        //System.out.println("Enter array : ");
        // String[] arr = b.readLine().split(" ");
        // int[] array = new int[arr.length];
        // for(int i=0;i<array.length;i++){
        //     array[i] = Integer.parseInt(arr[i]);
        //     System.out.print(arr[i]+" ");
        // }
        // String[] arr = b.readLine().split(" ");
        // int[] array = new int[arr.length];
        // System.out.println("enter values for : ");
        // for(int i=0;i<arr.length;i++){
        //     array[i]  = Integer.parseInt(arr[i]);
        // }

        // System.out.println("your array is : ");
        // for(int i=0;i<array.length;i++){
        //     System.out.println(array[i]);
        // }

        
        // System.out.println("enter no of rows : ");
        // int rows = Integer.parseInt(b.readLine());
        // int matrix[][] = new int[rows][];

        // for(int i=0; i<rows; i++){
        //     System.out.println("enter values for row "+ (i));
        //     String[] arr = b.readLine().split(" ");
        //     matrix[i] = new int[arr.length];
        //     for(int j=0; j<arr.length;j++){
        //         matrix[i][j] = Integer.parseInt(arr[j]);
        //     }
        // }
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<matrix[i].length;j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println("\n");
        // }
        

  //  }

  // public class Geeks{
  //   public static void main(String[] args){
  //       System.out.println("hello world");
  //   }
  // }

  
// import java.util.Arrays;

// public class Geeks {
//     public static void main(String[] args)
//     {

//         // Get the Array
//         int intArr[] = { 10, 20, 15, 22, 35 };

//         // Get the second Array
//         int intArr1[] = { 10, 15, 22 };

//         // To compare both arrays
//         System.out.println("Integer Arrays on comparison: "
//                            + Arrays.compare(intArr, intArr1));
//     }
// }

// import java.util.Arrays;
// public class Geeks {
//     public static void main(String[] args)
//     {

//         // Get the Arrays
//         int intArr[] = { 10, 15,22 };

//         // Get the second Arrays
//         int intArr1[] = { 9, 15, 22 };

//         String a = "Sohail";
//         String b = new String("Sohail");

//         // To compare both arrays
//         System.out.println("Integer Arrays on comparison: "
//                            + Arrays.compare(intArr,intArr1));
//         System.out.println(a==b);
//     }
// }

public class Geeks{
  public static void main(String[] args){
    //String a = "Geeks";
    // String b = "";
    // for(int i=a.length()-1;i>=0;i--){
    //   char c = a.charAt(i);
    //   String c1 = Character.toString(c);
    //   b  = b.concat(c1);
    // }

    // System.out.println(b);
    StringBuffer a = new StringBuffer();
    a.append("Sohail");
    a.append("is a student");
    System.out.println(a);
    System.out.println(a.toString());
  }
}