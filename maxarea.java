class Solution {
    public int maxArea(int[] he) {
        int l=0;
        int r=he.length-1;
        int maxArea=0;
        while(l<r){
            int ht=Math.min(he[l],he[r]);
            int wd=r-l;

           int area=ht*wd;
           maxArea=Math.max(maxArea,area);

           if(he[l]<he[r]){
            l++;
           }
           else{
            r--;
           }

        }
        return maxArea;


    }
}
