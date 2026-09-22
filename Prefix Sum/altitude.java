class Solution {
    public int largestAltitude(int[] gain) {
        int[] ami=new int[gain.length+1];
        int i=0;
        int max=ami[0];
        
        ami[0]=0;
        for(i=0;i<gain.length;i++){
            ami[i+1]+=gain[i]+ami[i];
            if(ami[i+1]>max){
                max=ami[i+1];
            }
        }
       
        return max;




    }
}
