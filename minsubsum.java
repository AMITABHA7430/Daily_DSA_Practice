class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int c = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            c++;

            while (sum >= target) {
                ans = Math.min(ans, c);
                sum -= nums[left];
                left++;
                c--;
            }
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
