class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> ami=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(max<=(candies[i]+extraCandies)){
                ami.add(true);
                
            }
            else{
                ami.add(false);
                
            }
        }
        return ami;
    }
}
