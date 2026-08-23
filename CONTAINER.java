class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int max=0;
        int area=0;
        while(i<j){
          int width=j-i;
          int h=Math.min(height[i],height[j]);

          int a=width*h;

          area=Math.max(area,a);

          if(height[i]<height[j]){
            i++;
          }
          else{
            j--;
          }
        }
        return area;
    }
}
