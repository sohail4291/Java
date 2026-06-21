// import java.util.*;
// import java.util.Arrays;
// public class Recursion {
    // public static int helper(String s, int i, int num, int sign){
    //     if(i >= s.length() ||  !Character.isDigit(s.charAt(i))){
    //         return (int) sign * num;
    //     }
    //     num = num * 10 + (s.charAt(i) - '0');
    //     if(sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
    //     if(sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
    //     return helper(s,i+1,num,sign);
    // }
    // public static int myAtoi(String s){
    //     int i=0;
    //     int sign = 1;
    //     while(i < s.length() && s.charAt(i) == ' '){
    //         i++;
    //     }
    //     if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
    //         sign = (s.charAt(i) == '-') ? -1 : 1;
    //         i++;
    //     }
    //     return helper(s,i,0,sign);
    // }
    // public static double power(double x, int n){
    //     if(n == 0 || x == 1){
    //         return 1;
    //     }
    //     double ans = 1;
    //     long temp = n;
    //     if(n < 0){
    //         x  = 1/x;
    //         temp = -1L * n;
    //     }
    //     for(int i=0;i<temp;i++){
    //         ans = ans* x;
    //     }
    //     return ans;
    // }

    // public static double power(double x, int n){
    //     if(n == 0 || x == 1){
    //         return 1;
    //     }
    //     if(x == 0 ) return 0;
    //     if(n == 1) return x;
    //     if(n % 2 == 0){
    //         return power(x*x, n/2);
    //     }
    //     return x * power(x,n-1);
    // }
    // public static double mypower(double x, int n){
    //     if(n < 0){
    //         return 1/ power(x,-n);
    //     }
    //     return power(x,n);
    // }
    // public static int numsub(int[] arr, int K){
    //     int count = 0;
    //     int xor = 0;
        
    //     Map<Integer,Integer> map = new HashMap<>();
    //     map.put(0,1);
    //     for(int i=0;i<arr.length;i++){
    //         xor ^= arr[i];
    //         int rem = xor ^ K;
    //         if(map.containsKey(rem)){
    //             count += map.get(rem);
    //         }
    //         map.put(xor,map.getOrDefault(xor,0)+1);
    //     }
    //     return count;
    // }
    

