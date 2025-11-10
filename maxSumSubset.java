class Solution {
    int maxSubarraySum(int[] arr) {
        
      if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax  = Math.max(globalMax, currentMax);
        }

        return globalMax;
      
       
       
    }
}
