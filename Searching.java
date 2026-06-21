public class Searching {

    // public static int binarySearch(int[] arr,int key){
    //     int n = arr.length;
    //     int low =  0;
    //     int high = n-1;
    //     while(low < high){
    //         int mid  = (low + high)/2;
    //         if(key == mid){
    //             return mid;
    //         }
    //         else if(key > mid){
    //             low = mid+1;
    //         }
    //         else{
    //             high = mid-1;
    //         }
    //     }   
    //     return -1;

    // }
    // public static boolean binarySearch(int[] arr,int low, int high,int key){
    //     if(low >= high){
    //         return false;
    //     }
    //     int mid = (low + high) /2;
    //     if(key == mid){
    //         return true;
    //     }
    //     else if(key > mid){
    //         return binarySearch(arr,mid+1,high,key);
    //     }
    //     else{
    //         return binarySearch(arr,low, mid-1,key);
    //     }
    // }

    // public static int binarySearch(int[] arr,int target){
    //     int low = 0;
    //     int high = arr.length-1;
        
    //     while(low <= high){
    //         int mid = (low + high) /2;
    //         if(arr[mid] == target){
    //             return mid;
    //         }
    //         else if(target > arr[mid]){
    //             low = mid+1;
    //         }
    //         else{
    //             high = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    
    // public static void main(String[] args) {
    //     int[] arr = {1,1,3,4,5};
    //     int a = lowerBound(arr,2);
    //     System.out.println(a);
    //     // for(int i=0;i<arr.length;i++){
    //     //     System.out.print(arr[i]+" ");
    //     // }
        
    // }

    // public static int lowerBound(int[] arr, int target){
    //    int low = 0;
    //    int high = arr.length-1;
    //    int ans = arr.length;
    //    while(low <= high){
    //     int mid = (low + high)/2;
    //     if(arr[mid] >= target){
    //         ans = mid;
    //         high = mid - 1;
    //     }
    //     else{
    //         low = mid+1;
    //    }
    //    }
    //    return ans;
        
    // }

    //  public static int lowerBound(int[] arr, int x) {
    //     int low = 0;                  // Start index
    //     int high = arr.length - 1;    // End index
    //     int ans = arr.length;         // Default value if not found

    //     while (low <= high) {
    //         int mid = (low + high) / 2;  // Find mid index

    //         if (arr[mid] >= x) {
    //             ans = mid;            // Store possible answer
    //             high = mid - 1;       // Move left
    //         } else {
    //             low = mid + 1;        // Move right
    //         }
    //     }
    //     return ans;  // Return the lower bound index
    // }

    // public static int upperBound(int[] arr,int x){
    //     int low = 0;
    //     int high = arr.length-1;
    //     int ans = arr.length;
    //     while(low <= high){
    //         int mid = (low + high) /2;
    //         if(arr[mid] > x){
    //             ans = mid;
    //             high = mid -1;
    //         }
    //         else{
    //             low = mid +1;
    //         }
    //     }
    //     return ans;
    // }
    // public static int floorCeil(int[] arr, int x){
    //     int low = 0;
    //     int high = arr.length-1;
    //     int ans = arr.length;
    //     while(low <= high){
    //         int mid = (low + high) /2;
    //         if(arr[mid] <= x){
    //             ans = mid;
    //             low = mid+1;
    //         }
    //         else{
    //             high  = mid -1;
    //         }
    //     }
    //     return ans;
    // }

    // First and last occurance 
    // public static int occurance(int[] arr, int target){
    //     for(int i=arr.length-1;i>= 0;i--){
    //         if(arr[i] == target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int[] firstOccurance(int[] arr,int target){
    //     int n = arr.length;
    //     int low  = 0;
    //     int high = n-1;
    //     int ans = 0;
    //     // first occurance == lower bound
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(arr[mid] >= target){
    //             ans = mid;
    //             high = mid-1;
    //         }
    //         else{
    //             low = mid + 1;
    //         }
    //     }
    //     low = 0;
    //     high = n-1;
    //     int ans2 = 0;
    //     // last occurnace = binary with updation of high
    //     while(low <= high){
    //         int mid =(low + high) /2;
    //         if(arr[mid] == target){
    //             ans2= mid;
    //             low = mid + 1;
    //         }
    //         else if(arr[mid] < target){
    //             low = mid+1;
    //         }
    //         else{
    //             high = mid -1;
    //         }
    //     }
    //     return new int[] {ans,ans2};
    // }
    // public static int findLeftBound(int[] arr,int target){
    //     int low = 0;
    //     int high = arr.length-1;
    //     int ans = -1;
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(arr[mid] == target){
    //             ans = mid;
    //             high = mid-1;
    //         }
    //         else if(arr[mid] < target){
    //             low = mid + 1;
    //         }
    //         else{
    //             high = mid + 1;
    //         }
    //     }
    //     return ans;
    // }
    // public static int findRightBound(int[] arr,int target){
    //     int low = 0;
    //     int high = arr.length-1;
    //     int ans = -1;
    //     while(low <= high){
    //         int mid = (low +high)/2;
    //         if(arr[mid] == target){
    //             ans =mid;
    //             low = mid+1;
    //         }
    //         else if(arr[mid] > target){
    //             high = mid-1;
    //         }
    //         else{
    //             low = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    // rotated binary serch

    public static int rotatedBinarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
       while(low <= high){
        int mid = (low + high) /2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] == target && arr[high] == target){
            low++;
            high--;
            continue;
        }
        else if(arr[low] <= arr[mid]){
            if(arr[low] <= target && target < arr[mid]){
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        else{
            if(arr[mid] < target && target <= arr[high]){
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
       }
        return -1;
    }
    // public static int[] bound(int[] arr,int target){
    //     int left = findLeftBound(arr,target);
    //     int right = findRightBound(arr,target);
    //     return new int[] {left,right};
    // }

    
    public  static int findMin(int[] nums) {
        
        int low = 0;
        int high = nums.length-1;

        while(low < high){
            int mid = (low + high)/2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }

        }
        return nums[low];
    }
     public static int singleElement(int[] arr) {
        // Get the size of the array
        int n = arr.length;

        // Edge case: only one element in the array
        if (n == 1) return arr[0];

        // Edge case: first element is the unique one
        if (arr[0] != arr[1]) return arr[0];

        // Edge case: last element is the unique one
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        // Initialize binary search bounds (exclude first and last index)
        int low = 1, high = n - 2;

        // Perform binary search
        while (low <= high) {
            // Calculate middle index
            int mid = (low + high) / 2;

            // Check if middle element is the unique one
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            // If mid is in the left half (pairing is valid)
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                // Move to the right half
                low = mid + 1;
            }
            // If mid is in the right half (pairing broken earlier)
            else {
                // Move to the left half
                high = mid - 1;
            }
        }

        // Dummy return (not reachable if input is valid)
        return -1;
    }

    public static int lowerbound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    // last occurance
    public static int upperbound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] > target){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    // floor == gretest element <= x
    // ceil = >= x lowerbound
    
    public static int floor(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= target){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }

    public static int peak(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low < high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[mid+1]){
                high = mid;
            }
            else{
                low  = mid +1;
            }
        }
        return low;
    }
    
    public static void main(String[] args) {
        int[] arr =  {1, 2, 1, 3, 5, 6, 4};
  // Sorted array // Target value
        int ind = peak(arr);   
        System.out.println("index: " + ind);  
    }
}
