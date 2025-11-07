// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];

        a[0] = arr[n - 1];
        int index = 1;

        for (int i = 0; i < n - 1; i++) {
            a[index++] = arr[i];
        }

        
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
    }
}
