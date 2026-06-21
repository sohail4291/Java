// selection sort => sorting finding the smallest number and swap the eleemtn 
// time = O(n*2)


// public class sorting {
//     public static void main(String[] args){
//         int arr[] = { 9, 5, 4, 6, 1};
//         int n = arr.length;
//         selectionsorting(arr,n);

//     }
//     public static void selectionsorting(int[] arr,int n){

//         for(int i=0;i<n;i++){
//             int min = arr[i];
//             for(int j=i+1;j<n;j++){
//                 if(arr[j] <= arr[i]){
//                    min = arr[j];
//                 }
//                 arr[i] = min;
//                 min = arr[j]; 
//             }
                
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

// }


// public class sorting{
//     public static void main(String[] args){
//         int arr[] = { 5, 4,3,2,1};
//         int n = arr.length;
//         //bubbleSort(arr,n);
//         selectionSort(arr,n);
//     }

//     // public static void bubbleSort(int arr[],int n){
//     //     for(int i=0;i<n;i++){
//     //         for(int j=0;j<n-1-i;j++){
//     //             if(arr[j] > arr[j+1]){
//     //                 int temp = arr[j];
//     //                 arr[j] = arr[j+1];
//     //                 arr[j+1] = temp;
//     //             }
//     //         }
//     //     }
//     //     for(int i=0;i<n;i++){
//     //         System.out.print(arr[i]+" ");
//     //     }
//     // }

//     public static void selectionSort(int arr[], int n){
//         for(int i=0;i<n;i++){
//             int min = i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j] < arr[min]){
//                     min = j;
//                 }
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }

// public class sorting{
//     // static int[][] arr = { {400,500, 300,200,100},
//     //                        {11,31,21,51,41},
//     //                        {5,4,3,2,1}, 
//     //                        {30,40,10,20,50}};
    
//     public void bubbleSort(int[] arr){
   
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i] > arr[j]){
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j]  = temp;
//                 }
//             }
//         }

//     }

//     public void selectionSort(int[] arr){
//         for(int i=0;i<arr.length;i++){
//             int minIdx = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j] < arr[minIdx]){
//                     minIdx = j;
//                 }
//                 int temp = arr[i];
//                 arr[i] = arr[minIdx];
//                 arr[minIdx] = temp;
//             }
//         }
//     }

//     public void insertionSort(int[] arr){
//         for(int i=1;i<arr.length;i++){
//             int key = arr[i];
//             int j = i-1;
//             while(j >= 0 && arr[j] > key){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//     }
//     public static void main(String[] args){
//         sorting sort  = new sorting();
//         int arr[] = {5,4,3,2,1};
//         //sort.bubbleSort(arr);
//         sort.selectionSort(arr);
//        //sort.insertionSort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
// }


// import java.util.*;
// public class sorting{
//     public static void mergeSort(int arr[], int low, int high){
//         if(low < high){
//             int mid = low + (high-low) /2;
//             mergeSort(arr,low, mid);
//             mergeSort(arr,mid+1,high);
//             mergeArrays(arr,low, mid, high);
//         }

//     }
//     public static void mergeArrays(int arr[], int low, int mid, int high){
//         ArrayList<Integer> temp = new ArrayList<>();
//         int i = low;
//         int j = mid+1;
       
//         while(i <= mid && j <= high){
//             if(arr[i] <= arr[j]){
//                 temp.add(arr[i]);
//                 i++;
//             }
//             else{
//                 temp.add(arr[j]);
//                 j++;
//             }
           
//         }
//         while(i <= mid){
//             temp.add(arr[i]);
//             i++;
//         }
//         while(j <= high){
//             temp.add(arr[j]);
//             j++;
//         }
//         for(i=low;i<=high;i++){
//             arr[i]  = temp.get(i-low);
//         }

//     }

//     public static void main(String[] args){
//         int[] arr = { 4,5,7,8,9,3,2,1,6};
//         mergeSort(arr,0,arr.length-1);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// // Quick sort lamuto partition algorithm

// import java.util.*;
// public class sorting{
    // public static void bubbleSort(int[] arr, int n){
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n-1-i;j++){
    //                 if(arr[j] > arr[j+1]){
    //                     int temp = arr[j];
    //                     arr[j] = arr[j+1];
    //                     arr[j+1] = temp;
    //                 }
    //         }
    //     }
    // }

    // public static void selectionSort(int[] arr,int n){
    //     for(int i=0;i<n-1;i++){
    //         int minIdx = i;
    //         for(int j=i+1;j<n;j++){
    //             if(arr[j] < arr[minIdx]){
    //                 minIdx = j;
    //             }
              
    //         }
    //           int temp = arr[i];
    //             arr[i] = arr[minIdx];
    //             arr[minIdx] = temp;
    //     }
    // }
    // public static void insertionSort(int[] arr,int n){
    //     for(int i=1;i<n;i++){
    //         int key = arr[i];
    //         int j= i-1;
    //         while(j >= 0 && arr[j] > key){
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = key;
    //     }
    // }
    
    
    // public static void merger(int[] arr,int low, int mid, int high){
    //     ArrayList<Integer> temp = new ArrayList<>();
    //     int left = low;
    //     int right = mid+1;

    //     while(left <= mid && right <= high){
    //         if(arr[left] <= arr[right]){
    //             temp.add(arr[left]);
    //             left++;
    //         }
    //         else{
    //             temp.add(arr[right]);
    //             right++;
    //         }
    //     }
    //     while(left <= mid){
    //         temp.add(arr[left]);
    //         left++;
    //     }
    //     while(right <= high){
    //         temp.add(arr[right]);
    //         right++;
    //     }
    //     for(int i=low;i <=high;i++){
    //         arr[i] = temp.get(i-low);
    //     }
        
    // }
    // public static void mergeSort(int[] arr,int low, int high){
    //     if(low >= high) { return ;}
    //     int mid = low + (high - low) /2;
    //     mergeSort(arr,low,mid);
    //     mergeSort(arr,mid+1,high);
    //     merger(arr,low,mid,high);
    // }
    
//     public static void merger(int[] arr,int low, int mid, int high){
//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.println(list);
//         int left = low;
//         int right = mid+1;
       
//         while(left <= mid && right <= high){
//             if(arr[left] <= arr[right]){
//                 list.add(arr[left++]);
//             }
//             else{
//                 list.add(arr[right++]);
//             }
//         }
//         while(left <= mid){
//            list.add(arr[left++]);
//         }
//         while(right <= high){
//             list.add(arr[right++]);
//         }
//         for(int i=low;i<=high;i++){
//             arr[i] = list.get(i-low);
//         }

//     }
//     public static void mergeSort(int[] arr, int low, int high){
//         if(low >= high){
//             return;
//         }
//         int mid = low + (high-low)/2;
//         mergeSort(arr,low,mid);
//         mergeSort(arr,mid+1,high);
//         merger(arr,low,mid,high);
//     }
//     public static void main(String[] args){
//         int[] arr= {10, 60, 30, 40, 20, 50};
//         int low = 0;
//         int high = arr.length-1;
       
//         //bubbleSort(arr, n);
//         //selectionSort(arr,n);
//        // insertionSort(arr,n);
//        mergeSort(arr,low,high);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// public class sorting{

//     public static void recursiveBubbleSort(int[] arr,int n){
//         if(n <= 1 ){
//             return;
//         }
//             for(int j=0;j<n-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
        
//         recursiveBubbleSort(arr,n-1);
//     }
//     public static void recursiveSelectionSort(int[] arr,int start,int n){
//         if(start == n-1){
//             return;
//         }
      
//             int minIdx = start;
//             for(int j=start+1;j<n;j++){
//                 if(arr[j] < arr[minIdx]){
//                     minIdx = j;
//                 }
//             }

//             int temp = arr[minIdx];
//             arr[minIdx] = arr[start];
//             arr[start]  = temp;

//         recursiveSelectionSort(arr,start+1,n);
        
//     }

//     public static void main(String[] args){
//         int[] arr = { 50, 20, 30, 10, 20};
//         int n  =arr.length;
//         //recursiveBubbleSort(arr, n);
//         int start = 0;
//         recursiveSelectionSort(arr,start,n);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
public class sorting{
    // public static List<Integer> quickSort(List<Integer> list){
    //     quickSortHelper(list,0,list.size()-1);
    //     return list;
    // }
    // public static void quickSortHelper(List<Integer> list,int low, int high){
    //     if(low < high){
    //         int pi  = partition(list,low,high);
    //         quickSortHelper(list,low,pi-1);
    //         quickSortHelper(list,pi+1,high);
    //     }
    // }
    // public static int partition(List<Integer>arr, int low,int high){
    //     int pivot = arr.get(low);
    //     int i = low;
    //     int j = high;
    //     while(i < j){
    //         while(arr.get(i) <= pivot && i <= high-1){
    //             i++;
    //         }
    //         while(arr.get(j) >= pivot && j >= low+1){
    //             j++;
    //         }
    //         if(i<j){
    //             int temp = arr.get(i);
    //             arr.set(i,arr.get(j));
    //             arr.set(j,temp);
    //         }
    //     }
    //     int temp = arr.get(low);
    //     arr.set(low,arr.get(j));
    //     arr.set(j,temp);
    //     return j;
    // }

    // public static void quickSort(int[] arr){
    //     quickSort(arr,0,arr.length-1);
    // }
    // public static void quickSort(int[] arr, int low, int high){
    //     if(low < high){
    //         int pivotIndex = partition(arr,low,high);
    //         quickSort(arr,low,pivotIndex);
    //         quickSort(arr,pivotIndex+1,high);
    //     }
    // }
    // public static int partition(int[] arr,int low, int high){
    //     int i= low -1;
    //     int j = high + 1;
    //     int pivot = arr[low];
    //     while(true){
    //         do{
    //             i++;
    //         }while(arr[i] < pivot);
    //         do{
    //             j--;
    //          } while(arr[j] > pivot);
    //         if(i >= j) return j;

    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //     }

    // }

    // public static int[] mergeSorting(int[] nums){
    //     if(nums == null || nums.length <=1){
    //         return nums;
    //     }
    //     mergeSort(nums,0,nums.length-1);
    //     return nums;
    // }
    // public static void mergeSort(int[] arr, int low,int high){
    //     if(low >= high){
    //         return;
    //     }
    //     int mid = low + (high-low)/2;
    //     mergeSort(arr,low,mid);
    //     mergeSort(arr,mid+1,high);
    //     mergehelper(arr,low,mid,high);
    // }
    
    // public static void mergehelper(int[] arr, int low, int mid,int high){
    //     int i= low, j = mid+1, k = 0;
    //     int[] newarr = new int[high - low +1];
    //     while(i <= mid && j<= high ){
    //         if(arr[i] <= arr[j]){
    //             newarr[k] = arr[i];
    //             i++;
    //         }
    //         else{
    //             newarr[k] = arr[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i <= mid){
    //         newarr[k++] = arr[i++];
    //     }
    //     while(j <= high){
    //         newarr[k++] = arr[j++];
    //     }
    //     // copy the elements to original array
    //     for(int x=0;x < newarr.length; x++){
    //         arr[low + x] = newarr[x];
    //     }
    // }
   
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length -1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_ind = i;
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i] > arr[j]){
                        min_ind = j;
                    }
            }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp; 
        }
    }
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void quicksort(int[] arr, int low, int high){
        int mid = low + high /2;
        while(low < high){
            int pivotIndex = partition(arr,low,high);
            quicksort(arr,low,pivotIndex-1);
            quicksort(arr,pivotIndex+1,high);
        }

    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
           if(arr[j] <= pivot){
            i++;
            swap(arr,i,j);
           } 
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        quicksort(arr,0,arr.length-1);
        for(int i : arr){
        System.out.print(i+" ");
        }
       
    }

}