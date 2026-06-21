// import java.util.Scanner;
// public class Patterns {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows :");
//         int rows = sc.nextInt();
//         sc.nextLine();
//         System.out.println("enter no of columns : ");
//         int columns = sc.nextInt();

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<columns;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("\n");
//         }
//     }
// }

// Triangle 

// import java.util.Scanner;
// public class Patterns {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows :");
//         int rows = sc.nextInt();
        

//         for(int i=0;i<rows;i++){
//             for(int j=0;j<= i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("\n");
//         }
//     }
// }

/// 1
/// 12
/// 123
/// 1234
/// 12345
// import java.util.Scanner;
// public class Patterns {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows :");
//         int rows = sc.nextInt();
        
        
//         for(int i=1;i<=rows;i++){
//            for(int j=1;j<= i;j++){
//             System.out.print(j+" ");
//            }
//             System.out.println("\n");
//         }
        
       
//     }
// }


///1
/// 22
/// 333
/// 4444
/// 55555

// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of rows ");
//           int rows = sc.nextInt();
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println("\n");
//         }
//     }
// }







///* * * * * 

///* * * *

// * * *

// * *

// *
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of rows ");
//           int rows = sc.nextInt();
//         for(int i=rows;i> 0;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println("\n");
//         }
//     }
// }


/// 12345
/// 1234
/// 123
/// 12
/// 12
/// 1
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number of rows : ");
//         int rows = sc.nextInt();
//         for(int i=rows;i>0;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println("\n");
//         }
//     }

// }


///    *   1
///   ***  3
///  ***** 5
/// *******7


// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows : ");
//         int rows = sc.nextInt();
        
//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=rows-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             for(int l=1;l<=rows-i;l++){
//                 System.out.print("9");
//             }
//             System.out.println("\n");
//         }
        
//     }
// }


///*******
/// *****
///  ***
///   *

// import java.util.Scanner;

// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows : ");
//         int rows = sc.nextInt();
//         for(int i=rows;i>0;i--){
//             for(int j=rows-i;j>0;j--){
//                 System.out.print(" ");
//             }
//             for(int k=2*i-1;k>0;k--){
//                 System.out.print("*");
//             }
//             for(int l=rows-i;l>0;l--){
//                 System.out.print("9");
//             }
//             System.out.println("\n");
//         }
//     }
// }


//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         for(int i=1;i<rows;i++){
//             for(int j=1;j<=rows-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=2*i-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println("\n");
//         }
//         for(int i=rows;i>0;i--){
//             for(int l=rows-i;l>0;l--){
//                 System.out.print(" ");
//             }
//             for(int m=2*i-1;m>0;m--){
//                 System.out.print("*");
//             }
//             System.out.println("\n");
//         }
//     }
// }




// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter num of rows : ");
//         int N = sc.nextInt();

//          for(int i=1;i<=2*N-1;i++){
//             int stars = i;
//             if(i > N){ stars = 2*N-i;}
//             for(int j=1;j<=stars;j++){
//                 System.out.print("*");
//             }
//             System.out.println("\n");
//          }
//     }
// }



// 1
// 01
// 101
// 0101
// 10101

// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter no of rows ");
//         int rows = sc.nextInt();


//        for(int i=1;i<=rows;i++){
//         int start = 1;
//         if(i % 2 == 0){
//             start = 0;
//         }
//         else{
//             start = 1;
//         }
//         for(int j=1;j<= i;j++){
//             System.out.print(start);
//             start = 1-start;
//         }
//         System.out.println("\n");
//        }

//     }
// }


// 4 
// 1      1
// 12    21
// 123  321
// 12344321
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter no of rows ");
//         int N = sc.nextInt();
//         int spaces = 2*(N-1);
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int j=1;j<= spaces;j++){
//                 System.out.print(" ");
//             }
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//             spaces -=2;
//         }
        
       

//     }
// }



// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows ");
//         int rows = sc.nextInt();
//         int start = 1;
//         for(int i=1;i<= rows;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(start+" ");
//                 start += 1;
                
//             }
//             System.out.println();
//         }
//     }
// }

// A
// AB
// ABC
// ABCD
// ABCDE
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows ");
//         int rows = sc.nextInt();
//         for(int i=1;i<=rows;i++){
//             int a = 65;
//             for(int j=1;j<=i;j++){
//                 System.out.print((char)a);
//                 a+=1;
//             }
//             System.out.println();
//         }
//     }
// }


// ABCDE
// ABCD
// ABC
// AB
// A
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows : ");
//         int rows = sc.nextInt();

//        for(int i=0;i<=rows;i++){
//         for(char ch='A'; ch<= 'A'+(rows-i-1); ch++){
//             System.out.print(ch);
//         }
//         System.out.println();
//        }

        
//     }
// }


// 4
// A
// BB
// CCC
// DDDD
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
      
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print((char)((int) 'A'+i));
                
//             }
//             System.out.println();
//         }
//     }
// }




// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc  = new Scanner(System.in);
//         System.out.println("Enter no of rows");
//         int rows = sc.nextInt();

//         for(int i=1;i<=rows;i++){
//             for(int j=1;j<=rows-i;j++){
//                 System.out.print("_");
//             }
//             int bpoint =(2*i-1)/2;
//             char ch = 'A';
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print(ch);
//                 if(j <= bpoint) {
//                     ch++;
//                 }
//                 else {
//                     ch--;
//                 }
//             }
//             for(int j=1;j<= rows-i;j++){
//                 System.out.print("_");
//             }
//             System.out.println();
//         }
//     }
// }


// 5
// 45
// 345
// 2345
// 12345
// import java.util.Scanner;
// public  class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows ");
//         int rows = sc.nextInt();
//         for(int i=rows; i>=1; i--){
//             for(int j=i; j<=rows; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }


// E
// DE
// CDE
// BCDE
// ABCDE
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter number of rows : ");
//         int N = sc.nextInt();
//         for(int i=0;i<N;i++){
//             for(char j=(char)(int)('A'+N-i-1);j<(char)(int)('A'+N); j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


//5
// ___________
// ____**_____
// ___****____
// __******___
// _********__
// _********_
// __******__
// ___****___
// ____**____
// __________

// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows ");
//         int N = sc.nextInt();
        
//         for(int i=0;i<N;i++){
//             for(int j=0;j< N-i;j++){
//                 System.out.print("_");
//             }
//             for(int j=0;j< 2*i;j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<= N-i;j++){
//                 System.out.print("_");
//             }
//             System.out.println();

            
//         }
//         for(int i=0;i<N;i++){
//               for(int j=0;j<=i;j++){
//                 System.out.print("_");
//             }
//             for(int j=0;j< ((2*N) - (2*i)-2);j++){
//                 System.out.print("*");
//             }
//             for(int j=0;j<=i;j++){
//                 System.out.print("_");
//             }
//             System.out.println();
        
//         }
        
//     }
// }


// 5
// *****
// *___*
// *___*
// *___*
// *****

// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows ");
//         int N = sc.nextInt();
//         for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//             if(i ==0 || j == 0 || i == N-1 || j== N-1){
//                 System.out.print("*");
//             }
//             else{
//             System.out.print("_");
//             }
//            }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter no of rows ");
//         int N = sc.nextInt();
//         for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//             if(i ==0 || j == 0 || i == N-1 || j== N-1){
//                 System.out.print(N);
//             }
//             else{
//             System.out.print("_");
//             }
//            }
//             System.out.println();
//         }
//     }
// }


// 1 2 2 2 2 2 1
// 1 2 3 3 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 3 3 2 1
// 1 2 2 2 2 2 1
// 1 1 1 1 1 1 1
// import java.util.Scanner;

// public class Patterns {
//     public static void main(String[] args)
//     {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<2*n-1;i++){
//             for(int j=0;j<2*n-1;j++){
//                 int top = i;
//                 int left = (2*n-2)-i;
//                 int bottom = j;
//                 int right = (2*n - 2)-j;
//                 System.out.print(2*n-1-Math.max(Math.max(left,right),Math.max(top,bottom))+" ");
//             }
//             System.out.println(" ");
//         }
//     }
// }


// 5
// *________*
// **______**
// ***____***
// ****__****
// **********
// ****__****
// ***____***
// **______**
// *________*
// import java.util.Scanner;
// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//          int spaces = 2*n-2;
//         for(int i=1;i<= 2*n-1;i++){
//             int stars = i;
//             if(i >= n){
//                 stars = 2*n-i;
//             }
//             for(int j=1;j<= stars;j++){
//                 System.out.print("*");
//             }
           
            
//             for(int j=1;j<= spaces;j++){
//                 System.out.print("_");
//             }
//             for(int j=1;j<=stars;j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//             if(i<n){
//                 spaces -=2;
//             }
//             else spaces +=2;
//         }
//     }
// }