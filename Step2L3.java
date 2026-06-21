
// import java.util.*;
// public class Step2L3 {
    
//     // public static List<List<Integer>> generate(int K){
//     //     List<List<Integer>> list = new ArrayList<List<Integer>>();
//     //     for(int i=0;i<K;i++){
//     //         List<Integer> row = new ArrayList<Integer>(Collections.nCopies(i+1,1));
//     //         for(int j=1;j<i;j++){
//     //             row.set(j,list.get(i-1).get(j-1) + list.get(i-1).get(j));
//     //         }
//     //         list.add(row);
//     //     }
//     //     return list;
//     // }

//     // public static List<Long> getnthrow(int n){
//     //    List<Long> row = new ArrayList<Long>();
//     //    long val = 1;
//     //    row.add(val);
//     //    for(int i=1;i<n;i++){
//     //     val = val * (n - i) / i;
//     //     row.add(val);
//     //    }
//     //    return row;
//     // }
//     // public static long pascalElement(int r, int c){
//     //     int n = r - 1;
//     //     int k = c - 1;
//     //     long result = 1;
//     //     for(int i=0;i<n;i++){
//     //         result *= (n - i);
//     //         result /= (i+1);
//     //     }
//     //     return result;
//     // }
//     public static List<Integer> pascalTriangle(int K){
//         List<Integer> row = new ArrayList<>();
//         int value = 1;
//         row.add(value);
//         for(int i=1;i<K;i++){
//             value = value * (K-i)/i;
//             row.add(value);
//         }
       
//        return row;
//     }
//     public static void main(String[] args){
//     //    List<List<Integer>> list = pascalTriangle(5);
//     //    for(List<Integer> i : list){
//     //     for(Integer j : i){ 
//     //         System.out.print(j+" ");
//     //     }
//     //     System.out.println();
//     //    }      

//     List<Integer> a = pascalTriangle(5);
//     for(Integer i : a){
//         System.out.print(i+" ");
//     }       
           
//     }
    
// }


//-------------------------------------------------
// import java.util.*;
// public class Step2L3{ 
    // public static List<Integer> majorityElement(int[] arr){
    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0;i<arr.length;i++){
    //         int val = arr[i];
    //         if(list.size() == 0 || list.get(0) != val){
    //         int count = 0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[j] == val){
    //                 count++;
    //             }
    //         }
    //         if(count > (arr.length/3)){
    //             list.add(val);
    //         }
    //         if(list.size() == 2) break;
    //         }
    //     }
    //     return list;
    // }

    // public static List<Integer> majorityElement(int[] arr){
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     int mini = arr.length / 3;
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int i=0;i<arr.length;i++){
    //        int value = map.getOrDefault(arr[i],0);
    //        map.put(arr[i],value+1);

    //        if(map.get(arr[i]) == mini){
    //         list.add(arr[i]);
    //        }
    //     }
    //     return list;
    // }

    // public static List<Integer> majorityElement(int[] arr){
    //     int count1  = 0 , count2 = 0 ;
    //     int ele1 = 0,ele2 =0;

    //     for(int i=0;i<arr.length;i++){
    //         if(count1 == 0 && ele1 != arr[i]){
    //             ele1 = arr[i];
    //             count1++;
    //         }
    //         else if(count2 == 0 && ele2 != arr[i]){
    //             ele2 = arr[i];
    //             count2++;
    //         }
    //         else if(ele1 == arr[i]){
    //             count1++;
    //         }
    //         else if(ele2 == arr[i]){
    //             count2++;
    //         }
    //         else{
    //             count1--;
    //             count2--;
    //         }
    //     }
    //     ArrayList<Integer> list = new ArrayList<>();
    //     count1 = 0; 
    //     count2 = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(ele1 == arr[i]){
    //             count1++;
    //         }
    //         if(ele2 == arr[i]){
    //             count2++;
    //         }
    //     }
        
    //     if(count1 >= arr.length/3){
    //         list.add(ele1);
    //     }
    //     if(count2 >= arr.length/3){
    //         list.add(ele2);
    //     }
    //     return list;
    // }
//     public static void main(String[] args){
//         int[] arr = { 11,11,33,33,11,11};
//         List<Integer> ans = majorityElement(arr);
//         for(Integer i : ans){
//             System.out.print(i+" ");
//         }
//     }
// }

//---------------------------------------------------------------------
// threeSum
// import java.util.*;
// import java.util.Arrays;

// public class Step2L3{

    // public static List<List<Integer>> threeSum(int[] arr){
    //     Set<List<Integer>> list = new HashSet<>();

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             for(int k=j+1;k<arr.length;k++){
    //                 if(arr[i]+arr[j]+arr[k] == 0){
    //                     List<Integer> a = Arrays.asList(arr[i],arr[j],arr[k]);
    //                     Collections.sort(a);
    //                     list.add(a);
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(list);
    // }
    // public static List<List<Integer>> threeSum(int[] arr){

    //     Set<List<Integer>> list = new HashSet<>();
    //     for(int i=0;i<arr.length;i++){
    //         Set<Integer> set = new HashSet<>();
    //         for(int j=i+1;j<arr.length;j++){
    //             int rem = 0 -(arr[i]+arr[j]);
    //             if(set.contains(rem)){
    //                 List<Integer> temp = Arrays.asList(arr[i],arr[j],rem);
    //                 Collections.sort(temp);
    //                 list.add(temp);
    //             }
    //             set.add(arr[j]);
    //         }
    //     }
    //     return new ArrayList<>(list);
    // }

//     public static List<List<Integer>> threeSum(int[] arr){
//         Arrays.sort(arr);
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             if(i > 0 && arr[i] == arr[i-1]) continue ;
//             int left = i+1; int right = arr.length -1;
//             while(left < right){
//                 int sum = arr[i] + arr[left] + arr[right];
//                 if(sum < 0){
//                     left++;
//                 }
//                 else if(sum > 0){
//                     right--;
//                 }
//                 else{
//                     List<Integer> row = Arrays.asList(arr[i],arr[left],arr[right]);
//                     list.add(row);
//                     left++;
//                     while(arr[left] == arr[left -1] && left < right) left++;
//                 }
//             }
//         }
//         return list;
//     }

//     public static void main(String[] args){
//         int[] arr = {-1,0,1,2,-1,-4};
//         List<List<Integer>> res = threeSum(arr);

//         for(List<Integer> triplet : res){
//             for(int num : triplet){
//                 System.out.print(num +" ");
//             }
//             System.out.println();
//         }
        
//     }
// }

//------------------------------------------------------------------------------------
// FOUR SUM NUMBERS
// import java.util.*;
// import java.util.Arrays;
// public class Step2L3{
    
    // public static List<List<Integer>> fourSum(int[] arr){
    //     Set<List<Integer>> set = new HashSet<>();

    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             for(int k=j+1;k<arr.length;k++){
    //                 for(int l=k+1;l<arr.length;l++){
    //                     long sum = (long) 0 - arr[i] - arr[j] - arr[k];
    //                     if(sum == 0){
    //                         List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
    //                         Collections.sort(temp);
    //                         set.add(temp);
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(set);
    // }

    // public static List<List<Integer>> fourSum(int[] arr){
    //     Set<List<Integer>> set = new HashSet<>();
    //     int n = arr.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             HashSet<Integer> seen = new HashSet<>();
    //             for(int k=j+1;k<n;k++){
    //                 long rem = (long) 0 - arr[i] - arr[j] - arr[k];
    //                 if(seen.contains((int) rem)){
    //                     List<Integer> row = Arrays.asList(arr[i],arr[j],arr[k],(int) rem);
    //                     Collections.sort(row);
    //                     set.add(row);
    //                 }
    //                 else{
    //                     seen.add(arr[k]);
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(set);
//     // }
//     public static List<List<Integer>> fourSum(int[] arr){
//         List<List<Integer>> list = new ArrayList<>();
//         Arrays.sort(arr);
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             if(i > 0 &&arr[i] == arr[i-1]) continue;
//             for(int j=i+1;j<n;j++){
//                 if(j > 0 && arr[j] ==  arr[j-1]) continue;
//                 int left = j+1; int right = n-1;
//                 while(left < right){
                   
//                     int sum = arr[i] + arr[j] + arr[left] + arr[right];
//                     if(sum > 0){
//                         right--;
//                     }
//                     else if(sum < 0){
//                         left++;
//                     }
//                     else{
//                         list.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
//                         left++;
//                         while(left < right && arr[left] == arr[left-1]) continue;

//                     }
//                 }
//             }
//         }
//         return list;
//     }
//     public static void main(String[] args){
//         int[] arr = {1,0,-1,0,-2,2};
//         List<List<Integer>> ans = fourSum(arr);
//         for(List<Integer> row : ans){
//             System.out.println(row);
//         }

//     }
// }

//---------------------------------------------------------------------
// Largest sum of Zeros
// import java.util.*;
// public class Step2L3{
//    public static int maxLen(int[] arr){
//     int n = arr.length;
//     HashMap<Integer,Integer> map = new HashMap<>();
//     int sum = 0; int maxlen = 0;
//     map.put(0,-1);
//     for(int i=0;i<arr.length;i++){
//          sum += arr[i];
//          if(sum == 0){
//             maxlen = i+1;
//          }
//          else{
//             if(map.containsKey(sum)){
//                 int len = i - map.get(sum);
//                 maxlen = Math.max(maxlen,len);
//             }
//             else{ map.put(sum,i);}
//          }
//     }
//     return maxlen;
// // }
// public static int maxLen(int[] arr){
//     int sum = 0;
//     int maxlen = 0;
//     Map<Integer,Integer> map = new HashMap<>();
//     for(int i=0;i<arr.length;i++){
//         sum += arr[i];
//         if(sum == 0){
//             maxlen = i+1;
//         }
//         else if(map.containsKey(sum)){
//             maxlen = Math.max(maxlen,i - map.get(sum));
            
//         }
//         else{
//             map.put(sum,i);
//             System.out.println(map);
//         }
//     }
//     return maxlen;
// }
//     public static void main(String[] args){
//         int[] A = new int[]{-9,3,-3,-1,6,-5};
//         int ans = maxLen(A);
//         System.out.println(ans);
//     }
// }

// public static List<List<Integer>> mergerOverlapping(int[][] intervals){
    //     List<List<Integer>> list = new ArrayList<>();
    //     Arrays.sort(intervals,(a,b) -> (a[0])- (b[0]));
    //     int i = 0;
    //     int n = intervals.length;
    //     while(i < n){
    //         int start = intervals[i][0];
    //         int end = intervals[i][1];
    //         int j = i+1;
    //         while(j < n && intervals[j][0] <= end){
    //             end = intervals[j][1];
                
    //             j++;
    //         }
    //         list.add(Arrays.asList(start,end));
    //         i = j;
    //     }
    //     return list;
    // }

//     public static List<List<Integer>> mergerOverlapping(int[][] intervals){
//         List<List<Integer>> list = new ArrayList<>();
//         for(int[] interval : intervals){
//             if(list.isEmpty() || list.get(list.size() -1).get(1) < interval[0]  ){
//                 list.add(Arrays.asList(interval[0],interval[1]));
//             }
//             else{
//                 int last = list.size() -1;
//                 int maxEnd = Math.max(list.get(last).get(1),interval[1]);
//                 list.get(last).set(1,maxEnd);
            
//             }
//         }
//         return list;
//     }
//     public static void main(String[] args) {
      
       
//     }
// }



// public class Step2L3 {
    // public static void merge(int[] arr1,int[] arr2){
    //     int m = arr1.length;
    //     int n = arr2.length;
    //     int i = m -1;
    //     int j = n-1;
    //     int k = m+n-1; 
    //     while(i >= 0 && j >= 0){
    //         if(arr1[i] > arr2[j]){
    //             arr1[k--] = arr1[i--];
    //         }
    //         else{
    //             arr1[k--] = arr2[j--];
    //         }
    //     }
    //     while(j >= 0){
    //         arr1[k--] = arr2[j--];
    //     }
    // }
//     public static void merge(int[] arr1, int[] arr2) {

//     int m = 3;              // ✅ actual valid elements in arr1
//     int n = arr2.length;

//     int i = m - 1;
//     int j = n - 1;
//     int k = m + n - 1;      // ✅ last index of arr1 (buffer included)

//     while (i >= 0 && j >= 0) {
//         if (arr1[i] > arr2[j]) {
//             arr1[k--] = arr1[i--];
//         } else {
//             arr1[k--] = arr2[j--];
//         }
//     }

//     while (j >= 0) {
//         arr1[k--] = arr2[j--];
//     }
// }
public class Step2L3 {
    // public static int[] missingNumber(int[] arr){
        
    //     int repeating = -1;
    //     int missing = -1;
    //     for(int i=1;i<= arr.length;i++){
    //         int count = 0;
    //         for(int j=0;j<arr.length;j++){
    //             if(arr[j] == i){
    //                 count++;
    //             }
    //         }
    //         if(count == 2){
    //             repeating = i;
    //         }
    //         else if(count == 0){
    //             missing = i;
    //         }
    //         if(repeating != -1 && missing != -1){
    //             break;
    //         }
    //     }
    //     return new int[]{repeating,missing};
    // }
    // public static int[] missingNumber(int[] arr){
    //     int[] hash = new int[arr.length+1];
    //     for(int i=0;i< arr.length;i++){
    //         hash[arr[i]]++;  // hash[arr[i]] = hash[arr[i]]+1;
    //     }
    //     int missing  = -1;
    //     int repeating = -1;
    //     for(int i=1;i<=hash.length;i++){
    //         if(hash[i] == 2){
    //             repeating = i;
    //         }
    //         else if(hash[i] == 0){
    //             missing = i;
    //         }
    //         if(repeating != -1 && missing != -1){
    //             break;
    //         }
    //     }
    //     return new int[]{repeating,missing};
    // }
    // public static int[] missingNumber(int[] arr){
    //     int n = arr.length;
    //     int s1 = n * (n+1) / 2;
    //     int sn1 = n * (n + 1) *(2*n+1) / 6; 
    //     int s2 = 0;
    //     int sn2 = 0;
    //     for(int i=0;i<arr.length;i++){
    //         s2 += arr[i];
    //         sn2 += arr[i] * arr[i];
    //     }
    //     int a = s1 - sn1;

    //     int b = s2 - sn2;
    //     b = b / a;
    //     int x = (a + b)/ 2;
    //     int y = x - a;

    //     return new int[]{x,y};
    // }
    // public static int missingNumber(int[] arr){
    //     List<Integer> list = new ArrayList<>();
    //     for( int i : arr){
    //         if(list.isEmpty()){
    //             list.add(i);
    //         }
    //         else if(i > 0){
    //             if(list.get(list.size()-1) < 0){
    //                 list.add(i);
    //             }
                
    //         }
    //         else if(i < 0){
    //             if(list.get(list.size()-1) > 0 ){
    //                 list.add(i);
    //             }
    //         }
    //     }
    //     int sum = 0;
    //     int max_sum = 0;
    //     for(int i=list.size()-1;i>=0;i--){
    //         sum += arr[i];
    //         max_sum = Math.max(sum,max_sum);
    //     }
    //     return max_sum;
    // }

    
    // public static int longsum(int[] arr, int K){
    //     int maxlen = 0;
    //     int sum = 0;
    //     int left = 0;
    //     int right = 0;
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     while(right < arr.length){
    //         sum += arr[right];
    //         while(sum > K){
    //             sum -= arr[left];
    //             left++;
    //         }
    //         if(sum == K){
    //            maxlen = Math.max(maxlen, right - left +1);
    //         }
    //         right++;
    //     }
    //    return maxlen; 
    // }
//    public static int longsum(int[] arr){
//     int sum = 0;
//     int maxi = Integer.MIN_VALUE;
//     int start  = 0;
//     int ansstart = 0;
//     int ansend = 0;
//     for(int i=0;i<arr.length;i++){
//         if(sum == 0){
//             start = i;
//         }
//         sum += arr[i];
//         if(sum > maxi){
//             maxi = sum;
//             ansstart = start;
//             ansend = i;
//         }
//         if(sum < 0){
//             maxi = 0;
//         }
//     }
//     for(int j=ansstart;j<ansend;j++){
//         System.out.print(arr[j]);
//     }
//     return maxi;
//    }

    // public static int[] findMissing(int[] arr){
    //     int n = arr.length;
    //     int xr = 0;
    //     for(int i=0;i<n;i++){
    //         xr = xr ^ arr[i];
    //         xr = xr ^ (i+1);
    //     }

    //     int number = xr & ~(xr-1);

    //     int one = 0;
    //     int zero = 0;
    //     for(int i=0;i<n;i++){
    //         if((number & arr[i]) != 0){
    //             one ^= arr[i];
    //         }
    //         else{
    //             zero ^= arr[i];
    //         }
    //     }
    
    //     // for(int i=1;i<=n;i++){
    //     //    if((number & i) != 0){
    //     //     one ^= i;
    //     //    }
    //     //    else{
    //     //     zero ^= i;
    //     //    }
    //     // }
    //     int count = 0;
    //     for(int val : arr){
    //         if(val == zero){
    //             count++;
    //         }
    //     }
    //     if(count == 2){
    //         return new int[] {zero,one}; // repeat,missing
    //     }
    //     return new int[] {one,zero};
    // } 

    // public static List<List<Integer>> countInversions(int[] arr){
    //     List<List<Integer>> list = new ArrayList<>();
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=1;j<arr.length;j++){
    //             if(arr[i] > arr[j]){
    //                 list.add(Arrays.asList(arr[i],arr[j]));
    //             }
    //         }
    //     }
    //     return list;
    // }

    // public static void merge(int[] arr,int low,int mid,int high){
    //     List<Integer> list = new ArrayList<>();
    //     int left = low; 
    //     int right = mid+1;

    //     while(left <= mid && right <= high){
    //         if(arr[left] <= arr[right]){
    //             list.add(arr[left]);
    //             left++;
    //         }
    //         else{
    //             list.add(arr[right]);
    //             right++;
    //         }
    //     }

    //     while(left <= mid){
    //         list.add(arr[left]);
    //         left++;
    //     }

    //     while(right <= high){
    //         list.add(arr[right]);
    //         right++;
    //     }

    //     int k = 0;
    //     for(int i = low; i <= high; i++){
    //         arr[i] = list.get(k++);
    //     }
    // }

    // public static void mergesort(int[] arr,int low, int high){
    //     if(low >= high) {
    //         return;
    //     }
    //     int mid = (low + high) /2;
    //     mergesort(arr,low,mid);
    //     mergesort(arr,mid+1,high);
    //     merge(arr,low,mid,high);
    // }
    // public static int partition(int[] arr,int low, int high){
    //     int pivot = arr[high];
    //     int i = low-1;
    //     for(int j = low;j< high;j++){
    //         if(arr[j] < pivot){
    //             i++;
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }

    //     }
    //     int temp = arr[i+1];
    //     arr[i+1] = arr[high];
    //     arr[high] = temp;
    //     return i+1;
    // }
    // public static void quicksort(int[] arr,int low, int high){
    //     if(low < high){
    //         int pivot = partition(arr,low,high);
    //         quicksort(arr,low,pivot-1);
    //         quicksort(arr,pivot+1,high);
    //     }
    // }
    // public static int merge(int[] arr,int low,int mid,int high){
    //     if (low >= high){
    //         return 0;
    //     }
    //     int left = low;
    //     int right = mid+1;
    //     int cnt = 0;
    //     int newarr[] = new int[high - low + 1];
    //     int k = 0;
    //     while(left <= mid && right <= high){
    //         if(arr[left] <= arr[right]){
    //             newarr[k++] = arr[left++];
    //         }
    //         else{
    //             newarr[k++] = arr[right++];
    //             cnt += (mid - left +1);
    //         }
    //     }
    //     while(left <= mid){
    //         newarr[k++] = arr[left++];
    //     }
    //     while(right <= high){
    //         newarr[k++] = arr[right++];
    //     }
    //     for(int i=low;i<= high;i++){
    //         arr[i] = newarr[i - low];
    //     }
    //     return cnt;
    // }

    // public static int countInversions(int[] arr,int low, int high){
    //     if(low >= high){
    //         return 0;
    //     }
    //     int count = 0;
    //     int mid = (low + high)/2;
    //     count += countInversions(arr,low,mid);
    //     count+= countInversions(arr,mid+1,high);
    //     count+= merge(arr,low,mid,high);
    //     return count;
    // }

    // C O U N T R E V E R S E P A I R S arr[i] > 2 * arr[right]
    // public static int countPairs(int[] arr,int low, int mid,int high){
    //     int left = low;
    //     int right = mid+1;
    //     int count = 0;
    //     for(int i=low;i<=mid;i++){
    //         while(right <= high && arr[i] > 2 *arr[right]){
    //             right++;
    //         }
    //         count += (right - (mid+1));
    //     }
    //     return count;
    // }
    // public static void merge(int[] arr,int low,int mid, int high){
    //     int left = low;
    //     int right = mid + 1;
    //     int count  = 0;
    //     int newarr[] = new int[high - low +1];
    //     int k = 0;
    //     while(left <= mid && right <= high){
    //         if(arr[left] < arr[right]){
    //             newarr[k++] = arr[left++];
    //         }
    //         else{
    //             newarr[k++] = arr[right++];
    //             count += (right - (mid+1));
    //         }
    //     }
    //     while(left <= mid){
    //         newarr[k++] = arr[left++];
    //     }
    //     while(right <= high){
    //         newarr[k++] = arr[right++];
    //     }
    //     for(int i=low;i<=high;i++){
    //         arr[i] = newarr[i-low];
    //     }
    // }

    // public static int countReverse(int[] arr,int low, int high){
    //     if(low >= high){
    //         return 0;
    //     }
    //     int count = 0;
    //     int mid = (low + high) /2;
    //     count += countReverse(arr,low,mid);
    //     count += countReverse(arr,mid+1,high);
    //     count += countPairs(arr,low,mid,high);
    //     merge(arr,low,mid,high);
    //     return count;
    // }


    public static int MaxProductSubArray(int[] arr){
        int maxi  = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<arr.length;i++){
            if(prefix == 0) {
                prefix = 1;
            }
            if(suffix == 0){
                suffix = 1;
            }
            prefix = prefix * arr[i];
            // suffix = suffix * arr[arr.length-i-1];
            maxi = Math.max(maxi, prefix);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0};

        int a = MaxProductSubArray(arr) ;
        System.out.println(a);
    }
}
