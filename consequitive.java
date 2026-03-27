class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        ArrayList<Integer> ami=new ArrayList<>();
        ArrayList<Integer> count=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            ami.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            int l=nums[i];
            while(ami.contains(l)){
                c++;
                l+=1;
            }
            count.add(c);
            c=0;
        }

        return  Collections.max(count);
    }
}
