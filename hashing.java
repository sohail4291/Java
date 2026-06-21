// import java.util.Scanner;
// public class hashing {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = { 1,2,3,4,5,1,2,3,4,5,14};
//         int hash[] = new int[13];
//         for(int i=0;i<arr.length;i++){
//             hash[arr[i]]+=1;
//         }
//         int n = sc.nextInt();
//         while(n-- >0){
//             System.out.println("Enter a number ");
//             int a = sc.nextInt();
//             System.out.println(hash[a]);
//         }

//     }
    
// }

// 1. approach find number of times a number appear using a simple counter
// 2. using a precomputer array of hash size 13 limited numbers
// 3. character hashing using this appproach help but (what about the more number of chars)
// 4. hashing map

// import java.util.Scanner;
// public class hashing {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//        String s= "abcedabcdef";
//        int hash[] = new int[26];
//        for(int i=0;i<s.length();i++){
//             hash[s.charAt(i)-'a']++;
//        }
//        int n = sc.nextInt();
//        while(n-- > 0){
//         System.out.println("enter a character");
//         char c = sc.next().charAt(0);
//         System.out.println(hash[c-'a']);
//        }


//     }
    
// }


// import java.util.*;
// public class hashing {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//        int arr[] = { 1,2,3,4,5,1,2,3,4,5};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0;i< arr.length;i++){
//         int key = arr[i];
//         int freq = 0;
//         if(map.containsKey(key))
//         {
//             freq = map.get(key);
//         }
//         freq += 1;
//         map.put(key, freq);
//     }
//     System.out.println(map);

//     }
    
// }


// count frequencies in a array
// public class hashing{
//    public static void main(String[] args){
//     int arr[] = { 1,2,3,4,5,1,2,3,10,10,11,11,12};
//     int n = arr.length;
//     countFreq(n, arr);
//    }
//     public static void countFreq(int n, int arr[]){
//         boolean visited[] = new boolean[n];
//         for(int i=0;i<n;i++){
//             if(visited[i] == true){
//                 continue;
//             }
//             int count = 1;
//             for(int j= i+1;j<n;j++){
//                 if(arr[j] == arr[i]){
//                     visited[j] = true;
//                     count++;
//                 }
//             }
//              System.out.println(arr[i] + " "+ count);
//         }
       
//    }
// }


// import java.util.*;
// public class hashing{
//     public static void main(String[] args){
//         int arr[] = { 1,2,3,3,4,5,6,7};
//         countFreq(arr);

//     }
//     public static void countFreq(int arr[]){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//             map.put(arr[i],map.get(arr[i])+1);
//            }
//            else{
//             map.put(arr[i],1);
//            }
//         }
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             System.out.println(entry.getKey()+" "+entry.getValue());
//         }
//     }
// }


// public max frequency and min frequency
// public class hashing{
//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5,1,2,2,3,4,5,6};
//         int n = arr.length;
//         countFreq(arr,n);
//     }
//     public static void countFreq(int[] arr,int n){
//         boolean visited[] = new boolean[n];
//         int minFreq = n, maxFreq = 0;
//         int minEle = 0, maxEle = 0;
//         for(int i=0; i<n;i++){
//             if(visited[i] == true){
//                 continue;
//             }
//             int count = 1;
//             for(int j= i+1;j<n;j++){
//                 if(arr[i] == arr[j]){
//                     count ++;
//                     visited[j] = true;
//                 }
//             }
//             // max freq and ele
//             if(count > maxFreq){
//                  maxFreq = count;
//                  maxEle = arr[i];
//             }
//             if(count < minFreq){
//                 minFreq = count;
//                 minEle = arr[i];
//             }
            

//         }
//         System.out.println("max freq -> "+ maxEle);
//         System.out.println("min freq ->"+ minEle);
//     }
// }

// import java.util.*;
// public class hashing{
//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5,1,2,3,4,5,1,2,2,2,6};
//         int n = arr.length;
//         countFreq(arr,n);
//     }
//     public static void countFreq(int arr[],int n){
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//             if(map.containsKey(arr[i])){
//                 map.put(arr[i],map.get(arr[i])+1);
//             }
//             else{
//                 map.put(arr[i],1);
//             }
//         }

//         int minFreq = n, maxFreq = 0;
//         int minEle = 0, maxEle = 0;
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             int count = entry.getValue();
//             if(count > maxFreq){
//                 maxFreq = count;
//                 maxEle = entry.getKey();
//             }
//             if(count < minFreq){
//                 minFreq = count;
//                 minEle = entry.getKey();
//             }

//         }
//         System.out.println("max freq ele  "+ maxEle);
//         System.out.println("Min Freq ele "+ minEle);
//     }
// }


public class hashing{
    public static void main(String[] args){
        int arr[] = { 1,1,1,2,2,4};
        int k = 2;
        int a = maxFreq(arr, k);
        System.out.println(a);

    }
    public static int maxFreq(int[] arr,int k){
       int l =0 , r = 0;
        int total=0, res = 0;
        while(r < arr.length){
            total += arr[r];
            while(arr[r]*(r-l+1) > total + k){
                total -= arr[l];
                l+=1;
            }
            res = Math.max(res, r-l+1);
            r += 1;

        }
        return res;        
    }
}