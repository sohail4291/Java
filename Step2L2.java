// import java.util.*;
// public class Step2L2 {
    
    // public static boolean twoSum(int[] arr, int target){
    //     for(int i=0;i<arr.length;i++){
    //         int rem = target -arr[i];
    //         for(int j=i+1;j<arr.length;j++){
    //             if( arr[j] == rem){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    // public static boolean twoSum(int[] arr, int target){
    //     HashMap<Integer,Integer> map = new HashMap<>();

    //     for(int i=0;i<arr.length;i++){
    //         int rem = target - arr[i];
    //         if(map.containsKey(rem)){
    //             return true;
    //         }
    //         else{
    //             map.put(arr[i],i);
    //         }
    //     }
    //     return false;
    // }
    // public static void main(String[] args){
    //     int arr[] = {2,6,5,8,11};
    //     int target = 16;
    //     boolean ans = twoSum(arr,target);
    //     System.out.println(ans);

    // }
// }

// import java.util.*;
// public class Step2L2{
//     public static int[] twoSum(int[] arr,int target){
//         int ar[] = new int[2];
//         ar[0] = ar[1] = -1;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             int rem = target - arr[i];
//             if(map.containsKey(rem)){
//                 ar[0] = map.get(rem);
//                 ar[1] = i;
//                 return ar;
//             }
//             map.put(arr[i],i);
//         }
//         return ar;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         int[] ans = twoSum(arr, target);
//         System.out.println("This is the answer for variant 2: [" + ans[0] + ", "+ ans[1] + "]");

//     }
// }


// hoare's algo for quicksort using do while i++,j--,return j

// 2. sort 0, 1, 2 // dutch flag algorithm
// public class Step2L2{
//     public static void sortArray(int[] arr){
//         int low=0;
//         int mid = 0;
//         int high = arr.length-1;
//         while(mid <= high){
//             if(arr[mid]== 0){
//                 // int temp = arr[low];
//                 // arr[low] = arr[mid];
//                 // arr[mid] = temp;
//                 low++;
//                 mid++;
//             }else if( arr[mid] == 1){
//                 mid++;
//             }
//             else if (arr[mid] == 2){
//                 int temp = arr[mid];
//                 arr[mid] = arr[high];
//                 arr[high] = temp;
//                 high--;
//             }
//         }
//     }
//     public static void main(String[] args){
//         int[] arr = {2,0,1};
//         sortArray(arr);
//        for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//        }
//     }
// }

// 3. count the element majority times repeated >n/2

//public class Step2L2{
    // public static int majorityElement(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         int count = 0;
    //         int key = arr[i];
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
    //         if(count > arr.length/2){
    //             return key;
    //         }
    //     }
    //     return -1;
    // }

    // public static int majorityElement(int[] arr){
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     int maxvalue = 0;
    //     for(int i=0;i<arr.length;i++){
    //         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    //     }
    //     int key = 0;
    //     for(Map.Entry<Integer,Integer> i : map.entrySet()){
    //         key = i.getKey();
    //         int value = i.getValue();
    //         maxvalue = Math.max(maxvalue,value);
    //     }
    //     if(maxvalue > arr.length/2){
    //         return map.get(key);
    //     }
        
    //     return -1;
    // }

    // Moore's algorithm
//     public static int majorityElement(int[] arr){
//         int n = arr.length;
//         int ele = 0;
//         int cnt = 0;
//         for(int i=0;i<arr.length;i++){
//             if(cnt == 0){
//                 cnt = 1;
//                 ele = arr[i];
//             }else if(ele == arr[i]){
//                 cnt++;
//             }
//             else{
//                 cnt--;
//             }
//         }
//         int cnt1=0;
//         for(int i=0;i<n;i++){
//             if(arr[i] == ele){
//                 cnt1++;
//             }
//         }
//         if(cnt1> (n/2)){
//             return ele;
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] arr = {2,2,1,1,1,2,2};
//         int ans = majorityElement(arr);
//         System.out.println(ans);
//     }
// }


// Kaden's algorithms
// largerst sub array
// public class Step2L2{
//     // public static int maxSubArray(int[] arr){
//     //     int n = arr.length;
//     //     int maxsum = Integer.MIN_VALUE;
//     //     for(int i=0;i<n;i++){
//     //         for(int j=i;j<n;j++){
//     //             int sum = 0;
//     //             for(int k=i;k<=j;k++){
//     //                 sum += arr[k];
//     //             }
//     //             maxsum = Math.max(maxsum,sum);
//     //         }
//     //     }
//     //     return maxsum;
//     // }

//     // public static int maxSubArray(int[] arr){
//     //     int n = arr.length;
//     //     int maxvalue = Integer.MIN_VALUE;
//     //     for(int i=0;i<n;i++){
//     //         int sum = 0;
//     //         for(int j=i;j<n;j++){
//     //             sum += arr[j];
//     //             maxvalue = Math.max(maxvalue,sum);
//     //         }
//     //     }
//     //     return maxvalue;
//     // }
//     // public static int maxSubArray(int[] arr){
//     //     int maxi= 0;
//     //     int sum = 0;
//     //     for(int i=0;i<arr.length;i++){
//     //         sum += arr[i];
//     //         if(sum > maxi){
//     //             maxi = sum;
//     //         }
//     //         if(sum < 0){
//     //             sum = 0;
//     //         }
//     //     }
//     //     return maxi;
//     // }

//     // public static int maxSubArray(int[] arr){
//     //     int sum = 0;
//     //     int start = 0;
//     //     int anstart = 0;
//     //     int end = 0;
//     //     int max = Integer.MIN_VALUE;
//     //     for(int i=0;i<arr.length;i++){
//     //         if(sum == 0) start = i;
//     //         sum += arr[i];
//     //         if(sum > max){
//     //             max = sum;
//     //             anstart = start;
//     //             end = i;
//     //         }
//     //         if(sum < 0){
//     //             sum = 0;
//     //         }
//     //         for(int j=anstart;j<end;j++){
//     //             System.out.print(arr[j]+" ");
//     //         }
//     //     }
//     //     return max;
//     // }

//       // Kaden's Algorithm
//     public static int maxSubArray(int[] arr){
//         int max = arr[0];
//         int result = arr[0];
//         for(int i=1;i<arr.length;i++){
//             max = Math.max(max+arr[i],arr[i]);
//             result = Math.max(result,max);
//         }
//         return result;
//     }
//     public static void main(String[] args){

//         int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int sum = maxSubArray(arr);
//         System.out.println(sum);
        
//     }
// }

// Buy and sell
// public class Step2L2{
//     // public static int buyAndSell(int[] arr){
//     //     int sub = 0;
//     //     int max = 0;
//     //     int maxi = 0;
//     //     for(int i=0;i<arr.length;i++){
//     //         for(int j=i+1;j<arr.length;j++){
//     //             if(arr[j] > arr[i]){
//     //                 sub = arr[j] - arr[i];
//     //             }
//     //             max = Math.max(max,sub);
//     //             System.out.println(max);
//     //         }
//     //          maxi = Math.max(maxi,max);
//     //     }
//     //     return maxi;
//     // }
//     public static int buyAndSell(int[] arr){
//        int maxdiff = Integer.MAX_VALUE;
//        int result = 0;
//        for(int i=0;i<arr.length;i++){
//         maxdiff = Math.min(maxdiff, arr[i]);
//         result = Math.max(result, arr[i]-maxdiff);
//        }
//        return result;
//     }
//     public static void main(String[] args){
//         int[] arr = { 7,1,5,3,6,4};
//         int a =buyAndSell(arr);
//         System.out.println("max " + a);
//     }
// }

// Rearrange the array
// public class Step2L2{
//    public static int KadensAlgorithm(int[] arr){
//     int sum = 0;
//     int minprice  =Integer.MAX_VALUE;
//     for(int i=0;i<arr.length;i++){
//         minprice= Math.min(minprice,arr[i]);
//         sum = Math.max(sum,arr[i]-minprice);
       
//     }
   
//     return sum;
//    }
    // public static void rearrangeArray(int[] arr){
    //     ArrayList<Integer> pos = new ArrayList<>();
    //     ArrayList<Integer> neg = new ArrayList<>();
    //     ArrayList<Integer> newlist = new ArrayList<>();
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i] > 0){
    //             pos.add(arr[i]);
    //         }
    //         else{
    //             neg.add(arr[i]);
    //         }
    //     }
    //     for(int i=0;i<arr.length/2;i++){
    //         arr[2*i] = pos.get(i);
    //         arr[2*i+1] = neg.get(i);
    //     }

    // }
    // public static ArrayList<Integer> rearrangeArray(ArrayList<Integer> A){
    //     int n = A.size();
    //     ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));
    //     int pos = 0;
    //     int neg = 1;
    //     for(int i=0;i<n;i++){
    //         if(A.get(i) <= 0){
    //             ans.set(neg,A.get(i));
    //             neg += 2;
    //         }
    //         else{
    //             ans.set(pos,A.get(i));
    //             pos += 2;
    //         }
    //     }
    //     return ans;
    // }
    // public static int[] rearrangeArray(int[] arr){
    //     int n = arr.length;
    //     int[] newarr =new int[n];
    //     int pos = 0 , neg = 1;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]< 0){
    //             newarr[pos] = arr[i];
    //             pos += 2;
    //         }
    //         else{
    //             newarr[neg]= arr[i];
    //             neg += 2;
    //         }
    //     }
    //     return newarr;
//     // }
//     public static int[] rearrange(int[] arr){
//         int pos = 0;
//         int neg  = 1;
//         int n = arr.length;

//         while(pos < n && neg < n){
//             if(arr[pos] > 0){
//                 pos += 2;
//             }
//             else if(arr[neg] < 0){
//                 neg += 2;
//             }
//             else{
//                 int temp = arr[pos];
//                 System.out.print("temp : "+ temp);
//                 arr[pos] = arr[neg];
//                 System.out.print("pos"  + arr[pos]);
//                 arr[neg] = temp;
//                 System.out.print("neg" + arr[neg]);
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args){
//         int[] arr  = {3,1,2,-2,-5,2,-4,3,3,3,3};

//         int[] arr1 = rearrange(arr);
//         for(int i=0;i<arr.length ;i++){
//             System.out.print(arr1[i]+" ");
//         }
//     }
// }







// import java.util.*;
// import java.util.Arrays;
// // Next PERMUTATION
// public class Step2L2{
//     public static List<Integer> nextPermutation(int[] nums){
//         List<List<Integer>> all = new ArrayList<>();
//         Arrays.sort(nums);

//         permute(nums,0,all);

//         List<Integer> current = new ArrayList<>();
//         for(int i : nums){
//             current.add(i);
//         }
//         for(int i=0;i<all.size();i++){
//             if(all.get(i).equals(current)){
//                 if(i == all.size()-1){
//                     return all.get(0);
//                 }
//                 return all.get(i+1);
//             }
//         }
//         return current;
//     }
//     public static void permute(int[] nums,int start, List<List<Integer>> all){
//        if(start == nums.length){
//         ArrayList<Integer> temp = new ArrayList<>();
//         for(int i : nums){
//             temp.add(i);
//         }
//         all.add(new ArrayList<>(temp));
//         return;
//        }
//        for(int i=start;i<nums.length;i++){
//         swap(nums,i,start);
//         permute(nums,start+1,all);
//         swap(nums,i,start);
//        }
//     }
//     public static void swap(int[] arr,int i,int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
//     // public static void nextPermutation(int[] nums){
//     //     int pivot = -1;
//     //     int n = nums.length;
//     //     for(int i=n-2;i>=0;i--){
//     //         if(nums[i] < nums[i+1]){
//     //             pivot = i;
//     //             break;
//     //         }
//     //     }
//     //     if(pivot == -1){
//     //         reverse(nums,0,n-1);
//     //         return;
//     //     }
//     //     for(int i=n-1;i>pivot;i--){
//     //         if(nums[i] > nums[pivot]){
//     //             swap(nums,i,pivot);
//     //             break;
//     //         }
//     //     }
//     //     reverse(nums,pivot+1,n-1);
    
        
//     // }
//     // private static void swap(int[] nums,int p ,int q){
//     //     int temp = nums[p];
//     //     nums[p] = nums[q];
//     //     nums[q] = temp;
//     // }
//     // private static void reverse(int[] nums,int start,int end){
//     //     while(start < end){
//     //         swap(nums,start++,end--);
//     //     }
//     // }
//     public static void main(String[] args){
//         // int[] arr = {1,4,5,3,2,1};
//         // nextPermutation(arr);
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         List<List<Integer>> all = new ArrayList<>();
//         int[] arr = {1,2,3};

//         permute(arr,0,all);
//         for(int i=0;i<all.size();i++){
//             System.out.println(all.get(i));
//         }
//     }
// }

// import java.util.*;
// import java.util.Arrays;
// public class Step2L2{
//     public static ArrayList<Integer> leaders(List<Integer> arr){
//         ArrayList<Integer> newarr = new ArrayList<>();
//         int n = arr.size();
//         int max = arr.get(n-1);
//         newarr.add(arr.get(n-1));
//         for(int i=n-2;i>=0;i--){
//           if(arr.get(i) > max){
//             newarr.add(arr.get(i));
//             max = arr.get(i);
//           }
//         }
//         Collections.reverse(newarr);
//         return newarr;
//     }
//     public static void main(String[] args){
//         List<Integer> arr =   Arrays.asList(10,22,12,3,0,6);
//         List<Integer> ar = new ArrayList<Integer>();
//         ar = leaders(arr);
//         for(Integer i : ar){
//             System.out.print(i+" ");
//         }
//     }
// }


// largest consecutive sequence
// 1. using linearsearch {unconsecutive}
// 2. using arr[i] - 1 as last smallest {strict consecutive}
// 3. using set each element with while loop


// import java.util.*;
// public class Step2L2{
    
//    public static int longestSuccessiveElements(int[] arr){
//     int maxi = 0;
//     for(int i=0;i< arr.length; i++){
//         int ele = arr[i];
//         int longest = 1;
//         while(linearSearch(arr,ele+1) == true){
//             longest ++;
//             ele = ele + 1;
//         }
//         maxi = Math.max(maxi,longest);
//     }
//     return maxi;
//    }
//    public static boolean linearSearch(int arr[] ,int key){
//     for(int i=0;i<arr.length;i++){
//         if(arr[i] == key){
//             return true;
//         }
//     }
//     return false;
//    }

    // public static int longestSuccessiveElements(int[] arr){
    //     int lastsmallest = Integer.MIN_VALUE;
    //     int cnt = 0;
    //     int longest = 1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]-1 == lastsmallest){
    //             cnt += 1;
    //             lastsmallest = arr[i];
    //         }
    //         else if(arr[i]-1 != lastsmallest){
    //             cnt = 1;
    //             lastsmallest = arr[i];
    //         }
    //         longest = Math.max(longest,cnt);
    //     }
    //     return longest;
    // }

//     public static int longestSuccessiveElements(int[] arr){
//         HashSet<Integer> set = new HashSet<Integer>();
//         int cnt = 0;
//         int longest = 0;
//         int key = 0;
//         for(int i=0;i<arr.length;i++){
//             set.add(arr[i]);
//         }
//         for(int ele : set){
//             if(!set.contains(ele -1)){
//                 cnt = 1;
//                 key = ele;
//                 while(set.contains(key + 1)){
//                     cnt +=1;
//                     key += 1;
//                 }
//                 longest = Math.max(longest,cnt);
//             }
//         }
//         return longest;
//     }
//     public static void main(String[] args){
//         // int[] arr = {100,200,1,2,5,6,0,3,3,3,4 };
//         int[] arr = { 100,200,1,2,3,4};
//         int ans = longestSuccessiveElements(arr);
//         System.out.println(ans);

//     }
// }
// public class Step2L2{
    // public static void markrow(int[][] matrix, int m , int i){
    //     for(int j=0;j<m;j++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public static void markcol(int[][] matrix,int n,int j){
    //     for(int i=0;i<n;i++){
    //         if(matrix[i][j] != 0){
    //             matrix[i][j] = -1;
    //         }
    //     }
    // }
    // public static int[][] matrixzero(int[][] matrix){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(matrix[i][j] == 0){
    //                 markrow(matrix,n,i);
    //                 markcol(matrix,m,j);
    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(matrix[i][j] == -1 ){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    //     return matrix;
    // }
    // public static int[][] matrixzero(int[][] matrix){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int[] row = new int[n];
    //     int[] col = new int[m];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(matrix[i][j] == 0){
    //                 row[i] = 1;
    //                 col[j] = 1;
    //             }
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(row[i] == 1 || col[j] == 1){
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    //     return matrix;
    // }

//     public static int[][] matrixzero(int[][] matrix){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int col0 = 1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j] == 0){
//                     matrix[i][0] = 0; // markrow zero
//                     if(j != 0){
//                         matrix[0][j] = 0; // markcol j change
//                     }
//                     else{
//                         col0 = 0;
//                     }
//                 }
//             }
//         }
//         for(int i=1;i<n;i++){
//             for(int j=1;j<m;j++){
//                 if(matrix[i][j] != 0){
//                     if(matrix[i][0] == 0 || matrix[0][j] == 0){
//                         matrix[i][j] = 0;
//                     }
//                 }
//             }
//         }
//         if(matrix[0][0] == 0){
//             for(int i=0;i<n;i++){
//                 matrix[i][0] = 0;
//             }
//         }
//         if(col0 == 0){
//             for(int j=0;j<m;j++){
//                 matrix[0][j] = 0;
//             }
//         }
//         return matrix;
//     }
//     public static void main(String[] args){
//         int mat[][] = { { 1,1,1}, 
//                             {1,0,1},
//                             {1,1,1}};
//         int[][] matrix =  matrixzero(mat);

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
   
// }

// public class Step2L2{
    // public static int[][] rotate(int[][] matrix){
    //     int n = matrix.length;
    //     int m = matrix[0].length;
    //     int newmatrix[][] = new int[n][m];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             newmatrix[j][n-i-1] = matrix[i][j];
    //         }
    //     }
    //     return newmatrix;
//     // }
//     public static int[][] rotate(int[][] matrix){
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix.length /2;j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][matrix.length - j -1];
//                 matrix[i][matrix.length - j -1] = temp;
//             }
//         }
        
//         return matrix;
//     }
//     public static void main(String[] args){
//         int matrix[][] = { { 1,2,3}, { 4,5,6}, { 7,8,9}};
//         int n = matrix.length;
//         int m = matrix[0].length;
//         int newmatrix[][] = rotate(matrix);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(newmatrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Step2L2{
//     public static List<Integer> spiralOrder(int[][] mat){
//         int n = mat.length;
//         int m = mat[0].length;
//         ArrayList<Integer> list = new ArrayList<>();
//         int left = 0, top = 0, right = m-1, bottom = n-1;

//         while(left <= right && top <= bottom){
//             for(int i=left;i<= right;i++){
//                 list.add(mat[top][i]);
//             }
//             top++;
//             for(int i=top;i<=bottom;i++){
//                 list.add(mat[i][right]);
//             }
//             right--;
//             if(top <= bottom){
//                 for(int i=right;i>=left;i--){
//                     list.add(mat[bottom][i]);
//                 }
//                 bottom--;
//             }
//             if(left <= right){
//                 for(int i=bottom;i>=top;i--){
//                     list.add(mat[i][left]);
//                 }
//                 left++;
//             }
//         }
//         return list;
//     }
//     public static void main(String[] args){
//         int[][] mat = {{1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9, 10, 11, 12},
//                        {13, 14, 15, 16}};

//         List<Integer> newmat = spiralOrder(mat);

        
//             for(int j=0;j<newmat.size();j++){
//                 System.out.print(newmat.get(j)+" ");
//             }
        
//     }
// }




// import java.util.*;
// public class Step2L2{
    // public static int allSubarrays(int[] arr,int K){
    //     int res = 0;
    //      int count = 0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length;j++){
    //             int sum  = 0;
               
                
    //             for(int k=i;k<=j;k++){
    //                 sum+= arr[k];
    //             }
    //             if(sum == K){
    //                 count++;
    //             }
               
    //         }
    //     }
    //     return count;
    // }

    // public static int allSubarrays(int[] arr,int K){
    //     int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         int sum = 0;
    //         for(int j=i;j<arr.length;j++){
    //             sum += arr[j];
    //             if(sum == K){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

//     public static int allSubarrays(int[] arr, int K){
//         int presum  = 0;
//         int count =0;
//         Map<Integer,Integer> map = new HashMap<>();
//         map.put(0,1);
//         for(int i=0;i<arr.length;i++){
//             presum += arr[i];
            
//             int rem = presum - K;
//             count += map.getOrDefault(rem,0);
//            map.put(presum,map.getOrDefault(presum,0)+1);
//         }
//         return count;
//     }

//     public static void main(String[] args){
//          int[] arr = {3, 1, 2, 4};
//         int k = 6;
//         int cnt = allSubarrays(arr, k);
//         System.out.println("The number of subarrays is: " + cnt);
//     }
// }
public class Step2L2{
    // public static List<Integer> permutation(int[] arr){
    //     Arrays.sort(arr);
    //     List<List<Integer>> all = new ArrayList<>();
    //     permutate(arr,0,all);

    //     List<Integer> current = new ArrayList<>();
    //     for(int i : arr){
    //         current.add(i);
    //     }
    //     for(int i=0;i<all.size();i++){
    //         if(all.get(i).equals(current)){
    //             if(i == all.size() -1){
    //                 return all.get(0);
    //             }
    //             return all.get(i+1);
    //         }
    //     }
    //     return current;
    //  }
    // public static void permutate(int[] nums , int start, List<List<Integer>> all){
    //     if(start == nums.length){
    //         List<Integer> temp = new ArrayList<>();
    //         for(int i : nums){
    //             temp.add(i);
    //         }
    //         all.add(temp);
    //         return;
    //     }
    //     for(int i=start;i<nums.length;i++){
    //         swap(nums,i,start);
    //         permutate(nums,i+1,all);
    //         swap(nums,i,start);
    //     }
    // }
    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = nums[i];
    }
    public static void permutation(int[] arr){
        int pivot = 0;
        
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            reverse(arr,0,arr.length-1);
            return;
        }
        for(int i=arr.length-1;i>pivot;i--){
            if(arr[i] > arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        reverse(arr,pivot+1,arr.length-1);
       
    }
    public static void reverse(int[] arr,int left ,int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,1,7,5,0};
        permutation(arr);
        for(int i : arr){
            System.out.print(i);
        }
    }
}