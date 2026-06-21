import java.util.Arrays;

public class Main {
    // public static void main(String[] args) {
    //     URI uri = URI.create("https://example.com/api/users?id=5");

    //     System.out.println(uri.getScheme());   // https
    //     System.out.println(uri.getHost());     // example.com
    //     System.out.println(uri.getPath());     // /api/users
    //     System.out.println(uri.getQuery());    // id=5
    // }

    public static int kthmissing(int[] arr,int k){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= k){
                k += 1;
            }
            else{
                break;
            }
        }
        return k;

    }
    public static int kthmissing1(int[] arr,int k){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            int rem = arr[mid] - (mid + 1);
            if(rem < k){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return high+1+k;
    }
    public static int reqdays(int[] arr,int load){
        int capacity = 0;
        int days = 1;
        for(int i=0;i<arr.length;i++){
            if(capacity+arr[i] > load){
                capacity = arr[i];
                days++;
            }
            else{
                capacity += arr[i];
            }
        }
        return days;
    }
    public static int capacity(int[] arr,int d){
        int max = Arrays.stream(arr).sum();
        int min = Arrays.stream(arr).max().getAsInt();
        for(int i=min;i<max;i++){
            int days = reqdays(arr,i);
            if(days <= d){
                return i;
            }
            
        }
        return -1;
    }
    public static int capacity1(int[] arr,int d){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low <= high){
            int mid = (low + high)/2;
            int days = reqdays(arr,mid);
            if(days <= mid){
                high  = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
  // {1,2,3,4,6}
    public static boolean canplace(int[] arr,int cows,int d){
        int lastpos = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] - lastpos >= d){
                count ++;
                lastpos = arr[i];
            }
            if(count >= cows) return true;
        }
        return false;
    }
    public static int aggressivecows(int[] arr,int cows){
        int ans = 0;
       for(int i=1;i<=6;i++){
        if(canplace(arr,cows,i)){
            ans = i;
        }
       }
       return ans;
    }
    public static void main(String[] args){
        int[] arr = {5,4,5,2,3,4,5,6};
        int d = 5;
        int a = aggressivecows(arr,d);
        System.out.println(a);
    }
}

