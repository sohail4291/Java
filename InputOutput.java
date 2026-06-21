// public class InputOutput {
//     public static void main(String[] args) {
//         // System.out.print("Enter a character : ");
//         // int data  = System.in.read();
//         // System.out.println("You entererd :" + (char)data);
//         // System.out.println("Your entered : ascii : "+ data);
//         System.out.printf("Number  %c%n", 'c');
//         System.out.println("enterd number");
//         System.err.println("Error happened");

//     }
// }


// Scanner Methods
// import java.math.BigDecimal;
// import java.util.Scanner;
// public class InputOutput {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
        // int a = sc.nextInt();
        // sc.nextLine();
        // String b = sc.nextLine();
        // double d = sc.nextDouble();
        // float f = sc.nextFloat();
        // boolean e = sc.nextBoolean();
        // byte b = sc.nextByte();
        // sc.close();

        // System.out.println("Number is : "+ a);
        // System.out.println("next line :"+b);
        // System.out.println("next double :"+d);
        // System.out.println("next float :"+f);
        // System.out.println("boolean "+ e);
        // System.out.println("Byte :"+b);
        
    //     String s = sc.nextLine();
    //     BigDecimal num  = sc.nextBigDecimal();
    //     System.out.println("Big decimal : "+num);
    //     sc.close();
    // }
    
// }

// import java.io.*;

// public class MarkResetDemo {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br =
//             new BufferedReader(new InputStreamReader(System.in));

//         System.out.print("Enter text: ");
//         br.mark(10);

//         int ch1 = br.read();
//         System.out.println("First read: " + (char) ch1);

//         br.reset();
//         int ch2 = br.read();
//         System.out.println("After reset: " + (char) ch2);
//     }
// }







// public class InputOutput{
    // public static void merger(int[] arr,int low, int mid ,int high){
    //     int left = low;
    //     int right = mid+1;
    //     int[] newarr = new int[high-low+1];
    //     int i =0;
    //     while(left <= mid && right <= high){
    //         if(arr[left] <= arr[right]){
    //             newarr[i++] = arr[left];
    //             left++;
    //         }
    //         else{
    //             newarr[i++] = arr[right];
    //             right++;
    //         }
    //     }
    //     while(left <= mid){
    //         newarr[i++] = arr[left++];
    //     }
    //     while(right <= high){
    //         newarr[i++] = arr[right++];
    //     }
    //     for(int j=0;j< newarr.length;j++){
    //         arr[low + j] = newarr[j];
    //     }
    // }
    // public static void mergeSort(int[] arr, int low ,int high){
    //     if(low >= high){
    //         return;
    //     }
    //     int mid = low + (high -low ) /2;
    //     mergeSort(arr,low,mid);
    //     mergeSort(arr,mid+1,high);
    //     merger(arr,low,mid,high);
    // }    

//     public static int partition(int[] arr , int low, int high){
       
//         int pivot = arr[high];
//         int i = low-1;
//         for(int j=low;j<high;j++){
//             if(arr[j] <= pivot ){
//                 i++;
//                 int temp  = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         int temp =  arr[i+1];
//         arr[i+1] = arr[high];
//         arr[high] = temp;

//         return i+1;
//     }

//     public static void quicksort(int[] arr,int low, int high){
//         if(low < high){
//             int pivot = partition(arr,low,high);
//             quicksort(arr,low,pivot-1);
//             quicksort(arr,pivot+1,high);
//         }
//     }
//     public static void main(String[] args){
//         int[] arr= { 5,4,3,2,1};
//         int low = 0;
//         int high = arr.length-1;
//         quicksort(arr,low,high);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



public class InputOutput{
    
    // public static int binarySearch(int[] arr,int target){
    //     int low  = 0;
    //     int high = arr.length-1;
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(arr[mid] == target){
    //             return mid;
    //         }
    //         else if(arr[mid] < target){
    //             low = mid + 1;
    //         }
    //         else{
    //             high = mid -1;
    //         }
    //     }
    //     return -1;
    // }

    public static int binarySearch(int[] arr,int target,int low, int high){
        int mid = (low + high)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid] > target) { return binarySearch(arr,target,low,mid-1);}
        return binarySearch(arr,target,mid+1,high);

    }
    public static int lowerBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
    public static int upperBound(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
             int mid = (low + high)/2;
             if(arr[mid] > target){
                high = mid -1;
             }
             else{
                low = mid + 1;
             }


        }
        return low;

    }
    public static int floor(int[] arr,int target){
        int low =0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static int occurance(int[] arr,int target){
        int low = 0 ;
        int high =  arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
            
        }
        return high;
    }

    public static int sortedArray(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
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
                else{
                    high  = mid -1;
                }
            }
        }
        return -1;
    }

    public static int minimum(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[high]){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }

    public static int lower(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static int rotated(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(arr[mid] < target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    public static int minimumNum(int[] arr){
        int low = 0;
        int high = arr.length-1;
        
        while(low < high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }

        }
        
        return low;
    }

    public static boolean where(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[high]){
                   low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return false;
    }
    public static int min(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= arr[high]){
                ans = arr [low];
                low = mid + 1;
                
            }
            else{
                high = mid -1;
            }
            
        }
        return ans;
    }
    public static int howmanytimes(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > arr[high]){
                low = mid + 1;
            }
            else{
                high  = mid -1;
            }
        }
        return low;
    }
    public static int single(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }
            if((mid % 2 == 1 && arr[mid] == arr[mid-1]) || (mid % 2 == 0 && arr[mid] == arr[mid+1]) ){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
       int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int ans = single(arr);
        System.out.println(ans);
    }

}