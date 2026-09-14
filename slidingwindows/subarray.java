
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int l=0;
        int r=k-1;
        int sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        double max=(double)sum/k;

        while(r<nums.length-1){

            r++;
            sum=sum-nums[l];
            sum=sum+nums[r];
            l++;

            if(((double)sum/k)>max){
                max=(double)sum/k;
            }
        }

        return max;
    }
}

