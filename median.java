import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        Arrays.sort(arr);

        int k = m + n;
        int mid = k / 2;

        if (k % 2 != 0) {
            return arr[mid];
        } else {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        }
    }
}
