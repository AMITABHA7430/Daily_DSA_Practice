class Solution {
    public int characterReplacement(String s, int k) {
        
        int l = 0;
        int count = 0;
        int max = 0;
        
        int[] ami = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            
            ami[s.charAt(i) - 'A']++;
            
            if(ami[s.charAt(i) - 'A'] > max){
                max = ami[s.charAt(i) - 'A'];
            }
            
            count++;
            
            if(count - max > k){
                ami[s.charAt(l) - 'A']--;
                l++;
                count--;
            }
        }
        
        return count;
    }
}
