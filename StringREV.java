// User function Template for Java
import java.util.Arrays;

class Solution {
    public static String reverseString(String s) {
        int j = 0;
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length]; 

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }

        String reverse = new String(rev); 
        return reverse;
    }
}
