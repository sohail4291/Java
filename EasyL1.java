// public class EasyL1 {

//     public static int largestElement(int[] arr){
//         int n   = arr.length-1;
//         int i = 0;
//         int max = arr[i];
//         while(i <= n ){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//             i++;
//         }
//         return max;
//     }
//     public static void main(String[] args){
//         int arr[] = {5,3,2,1,4};
//         int a = largestElement(arr);
//         System.out.println(a);
//     }
// }

// 2. second largest in an array
// public class EasyL1{
//     public static int secondLargest(int[] arr){
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;
//         for(Integer num : arr){
//             if(num > largest){
//                 secondLargest = largest;
//                 largest = num;
//             }
//             else if(num > secondLargest && num != largest){
//                 secondLargest = num;
//             }
//         }
//         if(secondLargest == Integer.MIN_VALUE){
//             return -1;
//         }
//         else{
//             return secondLargest;
//         }
//     }
//     public static void main(String[] args){
//         int[] arr = {5,2,3,1,4};
//         int a = secondLargest(arr);
//         System.out.println("second largest : "+a);
//     }
//}


// 3 . check array is sorted

// public class EasyL1{
//     public static boolean isSorted(int[] arr){
//         int n = arr.length-1;
//         for(int i=0;i<n;i++){
//             if(arr[i] > arr[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         int arr[] = {1,2,3,5,4};
//         boolean b = isSorted(arr);
//         System.out.println(b);
//     }
// }


//  4. remove duplicates from sorted array
// import java.util.*;
// public class EasyL1{
//     public static int removeDuplicates(int[] arr){
//         HashSet<Integer> set = new HashSet<>();
//         int n = arr.length-1;
//         for(int i=0;i<n;i++){
//             set.add(arr[i]);
//         }
//         int k=set.size();
//         int j = 0;
//         for(Integer num : set){
//             arr[j++] = num;
//         }
//         return k;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,2,2,3,3,3,5,7,6,5,5,9};
        
//         int k = removeDuplicates(arr);
//         System.out.println(k);
//         for(int i=0;i<k;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



// public class EasyL1{
//     enum Day{
//         Monday, Tuesday, Wednesday;
//     }
//     public static void main(String[] args){
//       for(Day e : Day.values()){
//         System.out.println(e);
//       }
//       Day today = Day.Monday;
//       System.out.println(today);
//     }
// }


// 4. sliding window problem
// public class EasyL1{
  // public static boolean rotateArray(int[] arr){
   
  //   int[] B= new int[arr.length];
  //   int index = 0;
  //   for(int i=0;i<arr.length-1;i++){
  //     if(arr[i] > arr[i+1]){
  //       index = i+1;    
  //     }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
  //   }
  //   for(int j=0;j<arr.length;j++){
  //     B[j] = arr[(j + index) % arr.length] ;
  //   }
  //   for(int i=0;i<arr.length-1;i++){
  //     if(arr[i] < arr[i+1]){
  //       return true;
  //     }
      

  //   }
  //   return false;
  // }
  // largest window sum


// public static int winsum(int[] arr,int k){
 
//   int maxsum = 0;
//   int n = arr.length;
//   for(int i=0;i<=n-k;i++){
//     int sum  = 0;
//     for(int j=i; j<i+k; j++){
//       sum = sum +  arr[j];
//     }
//     maxsum = Math.max(maxsum,sum);
//   }
  
//   return maxsum;
// }
// public static int winsum(int[] arr,int k){
//   int winsum = 0;
//   int maxsum = 0;
//   for(int i=0;i<k;i++){
//     winsum += arr[i];
//   }
//   //slide the window
//   for(int i=k;i<arr.length;i++){
//     winsum += arr[i] - arr[i-k];
//     maxsum = Math.max(maxsum,winsum);
//   }
//   return maxsum;
// }
//   public static void main(String[] args){
//     // int arr[] = { 3,4,5,1,2};
//     int arr[] = {2,1,5,1,3,2};
//     int k = 3;
//     int a = winsum(arr,k);
//     System.out.println("boolean : "+ a);

    
//   }
// }


// Remove duplicates
// public class EasyL1{
//   public static int removeDuplicates(int[] arr){
//     if(arr.length == 0 ){
//       return 0;
//     }
//     int i=0;
//     for(int j=1;j<arr.length;j++){
//       if(arr[j] != arr[i]){
//         i++;
//         arr[i] = arr[j];
//       }
//     }
//     return i+1;
//   }
//   public static void main(String[] args){
//     int[] arr = {0,0,1,1,1,2,2,3,3,4};
//     int count = removeDuplicates(arr);
//     for(int i=0;i<count;i++){
//       System.out.print(arr[i]+" ");
//     }
//   }
// }


// rotate array by one position 

// public class EasyL1{
// //   public static void rotate(int[] arr){
// //     int temp = arr[0];
// //     for(int i=0;i<arr.length - 1;i++){
// //       arr[i] = arr[i+1];
     
// //     }
// //     arr[arr.length-1] = temp; 
// // }

//   public static void rotate(int[] arr,int start, int end){
//     while(start < end){
//       int temp = arr[start];
//       arr[start] = arr[end];
//       arr[end] = temp;
//       start++;
//       end--;
//     }
        
//   }
//   public static void rotatebykey(int[] arr, int k){
//     int n = arr.length;
//     if(k >= n){
//       return;}
//     rotate(arr,0,n-1);
//     rotate(arr,0,k-1);
//     rotate(arr,k,n-1);
    
//   }
//   public static void main(String[] args){
//     int[] arr = {1};
//     int n = 2;
//     rotatebykey(arr,2);
//     for(int i=0;i<arr.length;i++){
//       System.out.print(arr[i] + " ");
//     }
//   }
// }


// move zeros to rigth
// public class EasyL1{
  // public static void movezeros(int[] arr){
  //   int n = arr.length;
  //   if(n <= 1){
  //     return;
  //   }
  //   int i=0;
  //   for(int j=0;j<=n-1;j++){
  //     if(arr[j] !=0 ){
  //       arr[i] = arr[j];
  //       i++;
  //     }
  //   }
  //   while(i<=n-1){
  //     arr[i] = 0;
  //     i++;
  //   }
  // }

//   public static boolean linearsearch(int[] arr, int key){
//     for(int i=0;i<arr.length;i++){
//       if(arr[i] == key){
//         return true;
//       }
//     }
//     return false;
//   }
//   public static void main(String[] args){
//     int[] arr = {1};
//     //movezeros(arr);
//     System.out.print(linearsearch(arr,20));
//     // for(int i=0;i<=arr.length-1;i++){
//     //   System.out.print(arr[i]+" ");
//     // }
//   }
// }


// find union 
// // Union of two arrays
// import java.util.*;
// public class MapInterface{
    // public static ArrayList<Integer> union(int[] arr1, int[] arr2){
    //     int n = arr1.length;
    //     int m = arr2.length;
    //     HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    //     ArrayList<Integer> unionlist = new ArrayList<Integer>();
    //     for(int i=0;i<n;i++){
    //         map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
    //     }
    //     for(int i=0;i<m;i++){
    //         map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
    //     }
    //     for(int i : map.keySet()){
    //         unionlist.add(i);
    //     }
    //     return unionlist;
    // }

    // public static ArrayList<Integer> union(int[] arr1,int[] arr2){
    //     Set<Integer> set = new HashSet<>();
    //     ArrayList<Integer> list = new ArrayList<Integer>();
    //     for(int i=0;i<arr1.length;i++){
    //         set.add(arr1[i]);
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         set.add(arr2[i]);
    //     }
    //     for(int i:set){
    //         list.add(i);
    //     }
    //     return list;
    // }

    // public static ArrayList<Integer> union(int[] arr1,int[] arr2){
    //     int n = arr1.length;
    //     int m = arr2.length;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int i = 0 , j = 0;
    //     while(i < n && j < m){
    //         if(arr1[i] <= arr2[j]){
    //             if(list.isEmpty() || list.get(list.size()-1) != arr1[i]){
    //                 list.add(arr1[i]);
                 
    //             }
    //             i++;
    //         }else{
    //             if(list.isEmpty() || list.get(list.size()-1) != arr2[j]){
    //                 list.add(arr2[j]);
                   
    //             }
    //             j++;
    //         }
    //     }
    //         while(i < n){
    //             if(list.get(list.size()-1) != arr1[i]){
    //                 list.add(arr1[i]);
                 
    //             }
    //             i++;
    //         }
    //         while(j < m){
    //             if(list.get(list.size()-1) != arr2[j]){
    //                 list.add(arr2[j]);
                  
    //             }
    //             j++;
    //         }
    //     return list;
    // }

//     public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
//     int n = arr1.length;
//     int m = arr2.length;
//     ArrayList<Integer> list = new ArrayList<>();
//     int i = 0, j = 0;

//     while (i < n && j < m) {
//         if (arr1[i] <= arr2[j]) {
//             if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
//                 list.add(arr1[i]);
//             }
//             i++;
//         } else {
//             if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
//                 list.add(arr2[j]);
//             }
//             j++;
//         }
//     }

//     while (i < n) {
//         if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
//             list.add(arr1[i]);
//         }
//         i++;
//     }

//     while (j < m) {
//         if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
//             list.add(arr2[j]);
//         }
//         j++;
//     }

//     return list;
// }

//     public static void main(String[] args){
//         int[] arr1 = {1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int arr2[] = {2, 3, 4, 4, 5, 11, 12,12};
//         ArrayList<Integer> arr = union(arr1,arr2);
//         for(int i : arr){
//             System.out.print(i + " ");

//         }

//     }
// }


//  missing number 
// approach 1 using flag and inner forloop
// approach 2 using hashmap
// public class EasyL1{
  // public static int missingNumber(int[] arr,int N){
    
  //   for(int i=1;i<= N;i++){
  //     int flag = 0;
  //     for(int j=0;j< N-1;j++){
  //       if(arr[j] == i){
  //         flag = 1;
  //         break;
  //       }
  //     }
  //     if(flag == 0){
  //       return i;
  //     }
  //   }
  //   return -1;
  // }
  // public static int missingNumber(int[] arr,int N){
  //   int hash[] = new int[N+1];
  //   for(int i=0;i<N-1;i++){
  //     hash[arr[i]]++;
  //   }
  //   for( int i=1;i<= N;i++){
  //     if(hash[i] == 0){
  //       return i;
  //     }
  //   }
  //   return -1;
  // }
  // public static int missingNumber(int[] arr, int N){
  //   int sum = 0;
  //   for(int i=1;i<= N;i++){
  //     sum += i;
  //   }
  //   int sum2 = 0;
  //   for(int i=0;i< arr.length;i++){
  //     sum2 += arr[i];
  //   }
  //   return sum - sum2;
  // }

  // public static int missingNumber(int[] arr,int N){
  //   int xor1 = 0; 
  //   int xor2 = 0;
  //   for(int i=0;i<N-1;i++){
  //     xor1 ^= (i+1);
  //     xor2 ^= arr[i];
  //   }
  //   xor1 = xor1 ^ N;
  //   System.out.println(xor1);
  //   System.out.println(xor2);
  //   return xor1 ^ xor2;
  // }

//   public static int missingNumber(int[] arr){
//     int xor1 = 0;
//     int xor2 = 0;
//     int N = arr.length;
//     for(int i=0;i< N;i++){
//       xor1 ^= (i);
//       xor2 ^= arr[i];
//     }
//     xor1 ^= N;
//     System.out.println(xor1);
//     System.out.println(xor2);
//     return xor1 ^ xor2;
    
//   }
//   public static void main(String[] args){
//     int[] arr = { 0,1,2,4,5};
//     int a = missingNumber(arr);
//     System.out.println("missingnumber : "+a);
//   }
// }
// public class EasyL1{
  // public static int findMaxCount(int[] arr){
    
  //   int count  = 1;
  //   int i =0;
  //   int j = i+1;
  //   while( j < arr.length){
  //     if(arr[i] == arr[j]){
  //       count++;
  //     }
  //     j++;
  //   }
    
  //   return maxi;
  // }
  // public static int removeDuplicates(int[] arr){
  //   if(arr.length == 0){
  //     return 0;
  //   }
  //   int i=0;
  //   for(int j=1;j<arr.length;j++){
  //     if(arr[j] != arr[i]){
  //       i++;
  //       arr[i] = arr[j];
  //     }
  //   }
  //   return i+1;
  // }
  
  // public static int findMaxConsecutive(int[] arr){
  //   if(arr.length <= 1){
  //     return arr[0];
  //   }
  //    int count = 1;
  //     int maxi = 0;
  //       int maxEle = arr[0];
  //   for(int i=1;i<arr.length;i++){
  //     if(arr[i] == arr[i-1]){
  //       count++;
  //     }
  //     else{
  //       count = 1;
  //     }
  //     // if(count > maxi){
  //     //   maxEle = arr[i];
  //     //   maxi = count;
  //     // }
  //     maxi = Math.max(maxi,count);
  //   }
  //   return maxi;
  // }

//    public static int findMaxConsecutiveOnes(int[] nums) {
//         if(nums.length <= 1){
//             return nums[0];
//         }
//         int count = 1;
//         int maxi = 0;

//         for(int i=1;i<nums.length;i++){
//             if(nums[i] == nums[i-1]){
//                 count++;
//             }
//             else{
//                 count = 1;
//             }
//             maxi = Math.max(maxi,count);
     
//         }
//         return maxi;
//     }
//   public static void main(String[] args){
//     System.out.println("hello world");
//     int arr[] = { 0,0};
//     int a = findMaxConsecutiveOnes(arr);
//     System.out.println(a);
    

//   }
 
// }



// repeated one time element
// using double for loop
// using hashMap
// using hashArray
// using XOR bitwise xor of two values is always 0
//public class EasyL1{
  // public static int getSingleElement(int[] arr){
  //   for(int i=0;i<arr.length;i++){
  //     int num = arr[i];
  //     int count = 0;
  //     for(int j=0;j<arr.length;j++){
  //       if(arr[i] == arr[j]){
  //         count++;
  //       }
  //     }
  //     if(count == 1) return num;
  //   }
  //   return -1;
  // }

  // public static  int getSingleElement(int[] arr){
  //   HashMap<Integer,Integer> map = new HashMap<>();
  //   for(int i=0;i<arr.length;i++){
  //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
  //   }
  //   for(Map.Entry<Integer,Integer> i : map.entrySet()){
  //     if(i.getValue() == 1){
  //       return i.getKey();
  //     }
  //   }
  //   return -1;
  // }
// public static int getSingleElement(int[] arr){
//   int xor = 0;
//   for(int i=0;i<arr.length;i++){
//     xor = xor ^ arr[i];
//   }
//   return xor;
// }
//   public static void main(String[] args){
//     int[] arr = { 1,2,2,3,3,4,4,1,5};
//     int ans = getSingleElement(arr);
//     System.out.println(ans);
//   }
// }

// get longest subarray length
// using all possible subarray's sum
// using two double forloops adding arr[j]
//public class EasyL1{
//   // public static int getLongestSubarray(int[] arr,int K){
//   //   int n = arr.length;
//   //   int maxlen = 0;
//   //   for(int i=0;i<n;i++){
//   //     for(int j=i;j<n;j++){
//   //       int sum =0;
//   //       for(int k=i;k<= j;k++){
//   //         sum += arr[k];
//   //       }
//   //       if(sum == K){
//   //         maxlen = Math.max(maxlen,j-i+1);
//   //       }
//   //     }
//   //   }
//   //   return maxlen;
//   // }

//   // public static int getLongestSubarray(int[] arr,int K){
//   //   int n = arr.length;
//   //   int maxlen =0;
//   //   for(int i=0;i<n;i++){
//   //     int sum =0;
//   //     for(int j=i;j<n;j++){
//   //       sum += arr[j];
//   //       if(sum == K){
//   //       maxlen = Math.max(maxlen,j-i+1);
//   //     }
//   //     }
      
//   //   }
//   //   return maxlen;
//   // }

// public static int getLongestSubarray(int[] arr,int k){
//    HashMap<Integer,Integer> map = new HashMap<>();
//    int sum = 0; 
//    int maxlen = 0;
//    for(int i=0;i<arr.length;i++){
//     sum += arr[i];
//     if(sum == k){
//       maxlen = Math.max(maxlen,i+1);
//     }
//     int rem = sum - k;
//     if(map.containsKey(rem)){
//       int len = i - map.get(rem);
//       maxlen = Math.max(maxlen,len);
//     }
//     if(!map.containsKey(rem)){
//       map.put(arr[i],i);
//       System.out.println(map.put(arr[i],i));
//     }
//    }
   

//     return maxlen;
// }

// public static int getLongestSubarray(int[] arr, int k){
//   int sum = 0;
//   int maxlen = 0;
//   HashMap<Integer,Integer> map = new HashMap<>();
//   int n = arr.length;
//   for(int i=0;i<n;i++){
//     sum+= arr[i];
//     if(sum == k){
//       maxlen  = Math.max(maxlen,i+1);
//     }
//     int rem = sum -k;
//     if(map.containsKey(rem)){
//       int len = i - map.get(rem);
//       maxlen = Math.max(maxlen,len);
//     }
//     if(!map.containsKey(rem)){
//       map.put(sum,i);
//     }
//   }
//    return maxlen;
// }

// public static int getLongestSubarray(int[] arr, int k){
//   int left = 0 , right = 0;
//   int sum = 0;
//   int n = arr.length;
//   int maxlen =0;

//   while(right < n){
//     sum += arr[right];
//     while(left < right && sum > k){
//       sum -= arr[left];
//       left++;
//     }
//     maxlen = Math.max(maxlen,right-left+1);
//     right++;
//   }
//   return maxlen;
// }
//   public static void main(String[] args){
//     int arr[] = {2,3,5,1,9};
//     int k = 10;
//     int a = getLongestSubarray(arr,k);
//     System.out.println(a);
//   }
// }

// import java.util.*;
// public class EasyL1{
//   public static String stringShortening(String s){
//     int n = s.length();
//     HashSet<Character> set = new LinkedHashSet<>();
//     for(int i=0;i<s.length();i++){
//         set.add(s.charAt(i));
//     }
//     StringBuilder newstr = new StringBuilder();
//     for(Character c : set){
//       newstr.append(c);
//     }
//     return newstr.toString();
//   }
//   public static void main(String[] args){
//     String str = "GeeksForGeeks";
//     String s = stringShortening(str);
//     System.out.println(s);
//   }
// }



// longest subarrayoflength +ve/-ve
public class EasyL1{
  // public static int getLongestSubarray(int[] arr,int K){
  //   int maxlen = 0;
  //   for(int i=0;i<arr.length;i++){
  //     for(int j=i;j<arr.length;j++){
  //       int sum = 0;
  //       for(int k=i; k <=j;k++){
  //         sum+= arr[k];
  //       }
  //       if(sum == K){
  //       maxlen =Math.max(maxlen,j-i+1);
  //       }
  //     }
  //   }
  //   return maxlen;
  // }
  // public static int getLongestSubarray(int[] arr,int K){
  //   int maxlen = 0;
  //   for(int i=0;i<arr.length;i++){
  //     int sum = 0;
  //     for(int j=i;j<arr.length;j++){
  //       sum += arr[j];
  //       if(sum == K){
  //         maxlen = Math.max(maxlen,j-i+1);
  //       }
  //     }
      
  //   }
  //   return maxlen;
  // }

  // public static int getLongestSubarray(int[] arr,int K){
  //   int left = 0; 
  //   int right = 0; 
  //   int sum = 0;
  //   int n = arr.length;
  //   int maxlen =0;

  //   while(right < n){
  //     sum += arr[right];
    
  //   while(left < right && sum > K){
  //     sum -= arr[left];
  //     left++;
  //   }
  //   if(sum == K){
  //     maxlen = Math.max(maxlen,right-left+1);
  //   }
  //   right++;
  // }
  //   return maxlen;
  

  // }


  public static int getLongestSubarray(int[] arr, int k){
  int left = 0 , right = 0;
  int sum = 0;
  int n = arr.length;
  int maxlen =0;

  while(right < n){
    sum += arr[right];
    while(left < right && sum > k){
      sum -= arr[left];
      left++;
    }
    maxlen = Math.max(maxlen,right-left+1);
    right++;
  }
  return maxlen;
}
  public static void main(String[] args){
    int[] arr = {1,-1,1,-1,2,3,5};
    int k = 0;
    int length  = getLongestSubarray(arr,k);
    System.out.println(length);
  }
}

// import java.util.*;
// public class EasyL1{
//   public static int movezeros(int[] arr,int k){
   
//   }
//   public static void main(String[] args){
//     int arr[] = { 2,3,5,1,9};
//     int k = 10;
//     int a = movezeros(arr,k);
//     System.out.println("longsum "+a);
//   }
// }