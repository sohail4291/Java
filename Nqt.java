import java.util.*;
import java.util.Arrays;
public class Nqt{
   
   // n = lastindex98
   public static void rotateArray(int[] arr,int n, int index, int value){
    if(n < 0){
        return;
    }
    int temp = arr[n];
    rotateArray(arr,n-1,index,value);
    if(n >= index){
        if(n+1 < arr.length){
            arr[n+1] = temp;
        }
        else{
            arr[index] = value;
        }
    }
    }


    static boolean bSearch(int elem, int arr[], int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem)
                return true;
            else if (arr[mid] < elem)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    public static boolean issubarray(int[] arr1, int[] arr2, int m, int n){
        if(m > n){
            return false;
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            boolean present = bSearch(arr1[i],arr2,n);
            if(present == false){
                return false;
            }
            
        }
        return true;
    }

    public static int longestsum(int[] arr,int k){
        int maxlen = 0;
        for(int i=0;i<arr.length;i++){
            int currsum = 0;
            for(int j=i;j<arr.length;j++){
                currsum += arr[j];
                if(currsum == k){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }

    public static int longestsum1(int[] arr,int k){
        int left = 0;int right = 0;
        int sum = 0;
        int maxlen = 0;
        while(right < arr.length){
            sum += arr[right];
            if(sum > k){
                sum = sum - arr[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right-left+1);
            }
            right++;
        }
        return maxlen;
    }

    public static int longsum(int[] arr){
        int sum = 0;
        int maxlen = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum == 0){
                maxlen = i+1;
            }
            else if(map.containsKey(sum)){ 
                maxlen = Math.max(maxlen, i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }

    public static int majority(int[] arr){
        int cnt = 0;
        int ele =0;
        for(int i=0;i<arr.length;i++){
            if(cnt == 0){
                cnt = 1;
                ele = arr[i];
            }
            else if(ele == arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                cnt2++;
            }
        }
        if(cnt2 >= arr.length/2){
            return ele;
        }
        return -1;
    }
    public static int kadens(int[] arr){
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minprice){
                minprice = arr[i];
            }
            else{
                profit = Math.max(profit, arr[i] - minprice);
            }
        }
        return profit;
    }

    public static int kadensMaxSum(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum < 0){
               sum = 0;
            }
            if(sum > maxi){
                maxi = sum;
            }
        }
        return maxi;
    }

    public static int stocks(int[] arr){
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        for(int price : arr){
            if(price < minprice){
                minprice = price;
            }
            else{
                profit = Math.max(profit, price - minprice);
            }
        }
        return profit;
    }
    public static boolean anagram(String str1, String str2){
       String s1 = str1.toLowerCase();
       String s2 = str2.toLowerCase();
        return s1.equals(s2);
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
    //    String s1 = sc.nextLine();
    //    System.out.println(s1);
    //    String s2 = sc.nextLine();
    //    System.out.println(s2);

    //    int n1 = s1.length();
    //    int n2 = s2.length();
    //    char[] c1 = new char[n1];
    //    char[] c2 =  new char[n2];
    //    for(int i=0;i<s1.length();i++){
    //     c1[i] = ()
    //    }
    
    

   }  
}
