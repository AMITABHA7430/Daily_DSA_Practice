class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int rslt=0;
        for(int i=0;i<nums.length;i++){
            for(int k=0;k<nums.length;k++){

                if(nums[i]==nums[k]){
                    count++;
                }
            }
            if(count<2){
                rslt=nums[i];
            }
            count=0;
        }
        return rslt;
    }
}
