import java.util.Arrays;

class Solution {
    public void mergeArrays(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        
        int m = a.length;     // FIXED
        for(int i = 0; i < b.length; i++){
            c[m] = b[i];
            m++;
        }
        
        Arrays.sort(c);
        
        for(int i = 0; i < a.length; i++){
            a[i] = c[i];
        }
        
        int n = a.length;    // FIXED
        for(int i = 0; i < b.length; i++){
            b[i] = c[n];
            n++;
        }
    }
}
