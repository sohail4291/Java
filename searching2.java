import java.util.Arrays;
public class searching2 {
    public static int sqrt(int a){
        int low = 0;
        int high = a/2;
        int ans = 0;
        int count = 0;
        while(low <= high){
            count++;
            int mid = low + (high-low)/2;
            if(mid * mid <= a){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        System.out.println(count);
        return ans;
    }

    public static int nthroot(int n,int m){
        int low = 0;
        int high = m;
        while(low <= high){
            int mid = (low + high)/2;
            int ans  = 1;
            for(int i=0;i<n;i++){
                ans = ans * mid;
                if (ans > m) break;
            }
            if(ans == m) return mid;
            if(ans < m) {
                low = mid +1;
            }
            else{
                high = mid -1;
            }

        }
        return -1;
    }
    // x is value and n is power( x ^ n)
    public static int root(int x, int n){
        int low = 0;
        int high = x;
      
        while(low <= high){
            int mid = (low + high)/2;
            int ans = 1;
            for(int i=0;i<n;i++){
                ans *= mid;
                if(ans > x) break;
            }
            if(ans == x) return mid;
            if(ans < x) {
                low = mid + 1;
            }
            else{
                high = mid -1;
            }

        }
        return -1;
    }

    public static int counttotalhours(int[] arr, int hourly) {
    int totalhours = 0;
    for (int pile : arr) {
        totalhours += (int) Math.ceil((double) pile / hourly);
    }
    return totalhours;
}

public static int eatingSpeed(int[] arr, int h) {
    int max = Arrays.stream(arr).max().getAsInt();
    for (int i = 1; i <= max; i++) {
        int hours = counttotalhours(arr, i);
        if (hours <= h) {
            return i;
        }
    }
    return max;
}
public static int eatSpeed(int[] arr, int hours){
    int maxPile = Arrays.stream(arr).max().getAsInt();
    int low = 0;
    int high = maxPile;
    int ans = maxPile;
    while(low <= high){
        int mid = (low + high)/2;
        int h = counttotalhours(arr,mid);
        if(h <= hours){
            ans = mid;
            high = mid -1;
        }
        else{
            low = mid +1;
        }
    }
    return ans;
}

// NO OF BOUQUETS OF FLOWERS
public static boolean ispossible(int[] arr,int day, int m, int k){
        int count = 0;
        int bouquet = 0;
        for(int i : arr){
            if(i <= day){
                count++;
                if(count == k){
                    bouquet++;
                    count = 0;
                }
            }
            else{
                count =0;
            }
        }
        return bouquet >= m;
    }
    public static int minDays(int[] arr, int m, int k) {
        long req = (long) m * k;
        if(req > arr.length) return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        int low = min; 
        int high = max;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(ispossible(arr,mid,m,k)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }


// public static int smallestDivisor(int[] arr, int limit) {
//     int max = Arrays.stream(arr).max().getAsInt();
//    for(int i=1;i< max;i++){
//     int sum = 0;
//     for(int j=0;j<arr.length;j++){
//         sum += Math.ceil((int) arr[j]/i);
//     }
//     if(sum <= limit){
//         return arr[i];
//     }
//    }
//    return -1;

// }

public static int smallestDivisor(int[] arr,int limit){
    int sum = 0;
    int low = 1;
    int high = Arrays.stream(arr).max().getAsInt();
    while(low <= high){
        int mid = (low + high)/2;
        for(int i:arr){
            sum += Math.ceil((int) i / mid);
        }
        if(sum <= limit){
            high = mid -1;
        }        
        else{
            low = mid +1;
        }
    }

    return low;

}

public static int capacity(int[] arr,int day){
    int max = Arrays.stream(arr).max().getAsInt();
    int sum = 0;
    for(int i=0;i<arr.length;i++){
        sum += arr[i];
    }
    int load = 0;
    int days = 0;
    for(int i=max; i<sum; i++){
        if((load + arr[i]) < max){
            load += arr[i];
        }
        else{
            days = days +1;
            load = arr[i];
        }
    }
    if(days < day){
        return days;
    }
    return -1;
}



// ship wiht in days

public static int totalDays(int[] arr, int max){
    int load = 0;
    int days = 1;
    for(int i=0;i<arr.length;i++){
        if((arr[i] + load) <= max){
            load += arr[i];
        }
        else{
            days = days +1;
            load = arr[i];
        }
    }
    return days;
 }
// public static int shipWithinDays(int[] arr,int days){
//     int max = Arrays.stream(arr).max().getAsInt();
//     int sum = Arrays.stream(arr).sum();

//     int low = max;
//     int high = sum;
//     int ans = 0;
//     while(low <= sum){
//         int mid = (low + high) /2;
//         int needed  = totalDays(arr,mid);
//         if(needed <= days){
//             ans = mid;
//             high = mid -1;
//         }
//         else{
//             low = mid + 1;
//         }
//     }
//     return ans;
// }
public static int shipWithinDays(int[] arr, int days) {
    int max = Arrays.stream(arr).max().getAsInt();
    int sum = Arrays.stream(arr).sum();

    int low = max;
    int high = sum;
    int ans = sum;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        int needed = totalDays(arr, mid);

        if (needed <= days) {
            ans = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return ans;
}
// k th missing number positive
public static int kthmissing(int[] arr,int k){
    
    for(int i=0;i<arr.length;i++){
       if(arr[i] <= k){
        k++;
       }
       else{
        break;
       }
  
      
    }
     return k;
}
public static int kthmissingpos(int[] arr,int k){
    int low = arr[0];
    int high = arr[arr.length-1];
    int ans = 0;
    while(low <= high){
        int mid = (low + high)/2;
        if(arr[mid] > mid + k){
            ans = mid + k;
            high = mid -1;
        }
        else{
            low = mid + 1;
        }
    }
    return ans;
}
public static int sqroot(int num){
    int result = 0;
    for(int i=0;i<= num/2;i++){
        if(i*i <= num){
            result = i;
        }
    }
    return result;
}
public static int sqroot1(int num){
    int low = 0;
    int high = num;
    int result = -1;
    while(low <= high){
        int mid = (low  + high)/2;
        if(mid * mid <= num){
            result = mid;
            low = mid + 1;
        }
        else{
            high = mid -1;
        }
    }
    return result;
}
public static int power(int n, int m){
    for(int i=0;i<m;i++){
        int power =(int) Math.pow(i,n);
        if(power == m){
            return i;
        }
        else if(power > m){
            break;
        }
    }
    return -1;
}
public static int powerHelp(int mid, int n,int m){
    int result = 1;
    for(int i=0;i<n;i++){
        result *= mid;
        if(result > m){
            return result;
        }

    }
    return result;
   
}
public static int power1(int n, int m){
    int low = 1;
    int high = m;
   
    while(low <= high){
        int mid = low + (high - low )/2;
        int res = powerHelp(mid,n,m);
        if(res == m){
            return mid;
        }
        if(res < m){
            low = mid + 1;
        }
        else{
            high =  mid - 1;
        }
    }
    return -1;
}

public static int hourly(int[] arr,int hourly){
    int totalHours = 0;
    for(int pile : arr){
        totalHours += (int)Math.ceil((double)pile /hourly);
    }
    return totalHours;
}
public static int koko(int[] arr,int hours){
    int result = 0;
    int max = Arrays.stream(arr).max().getAsInt();
    for(int i=1;i<= arr.length;i++){
       int hour = hourly(arr,i);
       if(hour <= hours){
        return i;
       }
    }
    return max;
}
public static int koko1(int[] arr,int hours){
    int low = 1;
    int high = Arrays.stream(arr).max().getAsInt();
    int ans = high;
    while(low <= high){
        int mid = (low + high)/2;
        int totalhours = hourly(arr,mid);
        if( totalhours <= hours){
            ans = mid;
            high  = mid -1;
        }
        else{
            low = mid + 1;
        }
    }
    return ans;
}
public static boolean noofbouquets(int[] arr,int day,int m,int k){
    int count = 0;
    int bouquet = 0;
    for(int bloom : arr){
        if(bloom <= day){
            count++;
            if(count == k){
                bouquet++;
            }
        }
        else{
            count = 0;
        }
    }
    return bouquet >= m;
}

public static int mbouquets(int[] arr,int n, int k){
    int min = Arrays.stream(arr).min().getAsInt();
    int max = Arrays.stream(arr).max().getAsInt();
    for(int i=min;i<=max;i++){
        if(ispossible(arr,i,n,k)){
            return i;
        }

    }
    return -1;
}
// public static int mbouquets(int[] arr,int n,int k){
//     int low = Arrays.stream(arr).min().getAsInt();
//     int high = Arrays.stream(arr).max().getAsInt();
//     int ans  = high;
//     while(low <= high){
//         int mid = (low + high)/2;
//         if(ispossible(arr,mid,n,k)){
//             ans = mid;
//             low = mid + 1;
//         }
//         else{
//             high = mid -1;
//         }
//     }
//     return ans;
// }
public static int divisor(int[] arr,int mid){
    int result = 0;
    for(int i=0;i<arr.length;i++){
        result += (int)Math.ceil(arr[i]/mid);
    }
    return result;

}
public static int smallestdivisor(int[] arr,int limit){
    int low = 1 ;
    int high = Arrays.stream(arr).max().getAsInt();
    while(low <= high){
        int mid = (low + high)/2;
        if(divisor(arr,mid) <= limit){
            high = mid -1;
        }
        else{
            low = mid + 1;
        }
    }
    return low;
}

public static boolean help(int[] arr,int k ,int num){
    int lastpos = arr[0];
    int count = 1;
    for(int i=1;i<arr.length;i++){
        if((arr[i] - lastpos) >= num){
            count++;
            lastpos = arr[i];
        }
        if(count >= k){
            return true;
        }
    }
    return false;
}
public static int aggressive(int[] arr,int k){
    Arrays.sort(arr);
    int max = arr[arr.length-1]-arr[0];
    int ans = 0;
    for(int i=0;i<max;i++){
        if(help(arr,k,i)){
            ans = i;
        }

    } 
    return ans;
}
public static int aggressive1(int[] arr,int k){
    int low = 0;
    Arrays.sort(arr);
    int high = arr[arr.length-1]-arr[0];
    int ans = 0;
    while(low <= high){
        int mid = (low + high)/2;
        if(help(arr,k,mid)){
            ans = mid;
            low = mid + 1;
        }
        else{
            high = mid -1;
        }
    }
    return ans;
}
public static int helper(int[] arr,int pages){
    int students = 1;
    int pagesforstudent = 0;
    for(int i=0;i<arr.length;i++){
        if((arr[i] + pagesforstudent) <= pages){
            pagesforstudent += arr[i];
        } 
        else{
            students++;
            pagesforstudent = arr[i];
        }
    }
    return students;
}
public static int findPages(int[] arr, int n, int m){
    int low = Arrays.stream(arr).max().getAsInt();
    int high = Arrays.stream(arr).sum();
    for(int i=low; i<=high; i++){
        if(helper(arr,i) == m){
            return i;
        }
    }
    return low;
}
public static int findPages1(int[] arr, int n, int m){
    int low = Arrays.stream(arr).max().getAsInt();
    int high = Arrays.stream(arr).sum();
    while(low <= high){
        int mid = (low + high)/2;
        int students =helper(arr,mid);
        if(students > m){
            low = mid+1;
        }
        else{
            high = mid -1;
        }
    }
    return low;
}
public static int requiredStations(int[] arr,int d){
    int count = 0;
    int gap;
    for(int i=0;i<arr.length-1;i++){
        gap = arr[i+1] - arr[i];
        count += (int) gap / d;
    }
    return count;
}
public static int  minmaxgasdist(int[] arr,int k){
    Arrays.sort(arr);
    int low = 0;
    int high = arr[arr.length-1] - arr[0];
    while(low <= high){
        int mid = (low + high)/2;
        if(requiredStations(arr,mid) > k){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    return high;

}
public static boolean isDecreaseOrder(int[] arr){
    int max = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(max < arr[i]){
            max = arr[i];
        }
        else{
            return false;
        }
    }
    return true;
}


public static void main(String[] args) {
        int arr[] = {67,17,72,4,3};
        System.out.println(isDecreaseOrder(arr)? arr[0]:arr[arr.length-1]);
    }
}