class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=k-1;

        int c=0;
        int max=0;

        Set<Character> vowels = Set.of('a','e','i','o','u');

        for(int i=l;i<=r;i++){
            if(vowels.contains(s.charAt(i))){
                c++;
            }
        }

        max=c;

        while(r<s.length()-1){

            r++;

            if(vowels.contains(s.charAt(l))){
                c--;
            }

            if(vowels.contains(s.charAt(r))){
                c++;
            }

            l++;

            if(max<c){
                max=c;
            }
        }

        return max;
    }
}
