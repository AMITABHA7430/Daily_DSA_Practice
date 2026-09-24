class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> c = new HashMap<>();


            for(int i=0;i<arr.length;i++){
                c.put(arr[i],c.getOrDefault(arr[i],0)+1);
            }
            List<Integer> b=new ArrayList<>();

            for(int a:c.values()){
                if(b.contains(a)){
                    return false;
                }
                b.add(a);
            }

            return true;
        


        

    }
}
