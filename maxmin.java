class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> maxmin = new ArrayList<Integer>();
        
        int min=arr[0];
            for(int j=1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                }
            }
            maxmin.add(min);
        int max=arr[0];
            for(int j=1;j<arr.length;j++){
                if(max<arr[j]){
                    max=arr[j];
                }
            }
            maxmin.add(max);
            
        return maxmin;
            
        
            
        
        
    }
}
