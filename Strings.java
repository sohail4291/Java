import java.util.*;
import java.util.Arrays;
public class Strings{

    public static String validParenthesis(String str){
        int level = 0;
        StringBuilder sb = new StringBuilder();
        for(char i : str.toCharArray()){
            if(i == '('){
                if(level > 0){
                    sb.append(i);
                } 
                level++;            
            }
            else{
                if(i == ')'){
                    level--;
                    if(level > 0){
                        sb.append(i);
                    }
                }
            }
            
        }
        return sb.toString();
    }


    public static String reversePalindrome(String str){
     List<String> list = new ArrayList<>();
     StringBuilder sb = new StringBuilder();

     for(int i=0;i<str.length();i++){

        if(str.charAt(i) != ' '){
            sb.append(str.charAt(i));
        }
        else{
            list.add(sb.toString());
            sb.setLength(0);
        }
     } 

        if(sb.length()> 0){
            list.add(sb.toString());
        
        }  
        Collections.reverse(list);
        return String.join(" ", list);
    }


    public static String reversePalindrome1(String str){
        int i = str.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0){
            while(i>0 && str.charAt(i) == ' '){
                i--;
            }
            if(i < 0){
                break;
            }
            int end = i;
            while(i >=0 && str.charAt(i) != ' '){
                i--;
            }
            String word = str.substring(i+1, end+1);
            if(sb.length() > 0){
                sb.append(" ");
            }
            sb.append(word);
        }
        return sb.toString();
    }



    public static String longestOddString(String str){
        int n = str.length()-1;
        int i;
        int index = -1;
        for(i = n;i>=0;i--){
            if((str.charAt(i)- '0') % 2 != 0){
                index = i;
                break;
            }
        }
        if(index == -1)
            return " ";
        i = 0;
        while(i <= index && str.charAt(i) == '0'){
            i++;
        }
        return str.substring(i,index+1);
    }

    public static String longestCommonPrefix(String[] arr){
        Arrays.sort(arr);
        
        StringBuilder ans = new StringBuilder();
        String first = arr[0];
        String last = arr[arr.length - 1];
        for(int i=0;i < Math.min(first.length(), last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static boolean isomorphicString(String s1, String s2){
        int arr[] = new int[256];
        int arr2[] = new int[256];
        int n = s1.length();
        for(int i=0;i<s1.length();i++){
            if(arr[s1.charAt(i)] != arr2[s2.charAt(i)]){
                return false;
            }
            arr[s1.charAt(i)] = i+1;
            arr2[s2.charAt(i)] = i+1;
        }
        return true;
    }

    public static boolean stringRotation(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            String rotated = a.substring(i) + a.substring(0,i);
            if(rotated.equals(b)){
                return true;
            }
            
        }
        return false;
    }
    public static boolean anagram(String s1, String s2){
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<s1.length();i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean anagram1(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            arr[b.charAt(i)-'a']--;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static String sortByFrequency(String s){
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));
        for(char ch : list){
            for(int i=0;i<map.get(ch);i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static int maxNestDeptParenthesis(String s){
        int level = 0;
        int maxi = 0;
        for(char ch : s.toCharArray()){
            maxi = Math.max(maxi,level);
            if(ch == '('){
                level++;
            }
            else if(ch == ')'){
                level--;
            }
            
        }
        return maxi;
    }

    public static int romanToNumeral(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        for(int i=0;i< s.length()-1; i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans -= map.get(s.charAt(i));
            }
            else{
                ans += map.get(s.charAt(i));
            }
        }
        return ans + map.get(s.charAt(s.length() -1));
    }



    
   public static int myAtoi(String s) {
    int i = 0, n = s.length();

    // skip spaces
    while (i < n && s.charAt(i) == ' ') {
        i++;
    }

    int sign = 1;

    // ONLY ONE sign allowed
    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        if (s.charAt(i) == '-') {
            sign = -1;
        }
        i++;
    }

    int result = 0;

    while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';

        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        result = result * 10 + digit;
        i++;
    }

    return sign * result;
    }



    //  number of substrings
    public static int numOfSubstrings(String s) {
    int[] last = {-1,-1,-1};
    int count = 0;
    for(int i=0;i<s.length();i++){
        last[s.charAt(i) - 'a']  = i;
        if(last[0] != -1 && last[1] != -1 && last[2] != -1 ){
            count += 1+ Math.min(last[0], Math.min(last[1],last[2]));
        } 
    }
    return count;
    }

    public static void printSubstrings(String s){
        int n = s.length();
        for(int i=0;i<n;i++){
            int[] hash = new int[3];
            for(int j=i;j<s.length();j++){
                hash[s.charAt(i) - 'a'] = 1;
                if(hash[0] + hash[1]+hash[2] == 3){
                    for(int k=j;k<s.length();k++){
                        System.out.println(s.substring(i,k+1));
                    }
                    break;
                }
            }
        }
    }

    public static int atMostDistinct(String s, int k){
        int left = 0; int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right= 0; right < s.length(); right++){
            map.put(s.charAt(right) , map.getOrDefault(s.charAt(right),0)+1);

            while(map.size() > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            res += (right - left + 1);
        }
         return res;
    }

    public static int countSubstrings(String s, int k){
        return atMostDistinct(s,k) - atMostDistinct(s,k-1);
    }

    
    public static String longestPalindrome(String s){
        int start = 0;int end = 0;
        for(int i=0; i<s.length();i++){
            int oddlen = expandFromCenter(s,i,i);
            int evenlen = expandFromCenter(s,i,i+1);
            int len = Math.max(oddlen,evenlen);
            if(len > end - start){
                start = i - (len -1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }

    public static int expandFromCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


    public static int beautySum(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j),0)+1);
                int max= Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int ch : map.values()){
                    min = Math.min(min,ch);
                    max = Math.max(max,ch);
                }
                sum += (max - min);
                
            }
        
        }
        return sum;
    }
    public static void main(String[] args){
        String s= "xyx";
        int k = 2;
       int a = beautySum(s);
       System.out.println(a);
          



    }
}