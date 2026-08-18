class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;

        for(char a : s.toCharArray()) {

            while(i < t.length() && t.charAt(i) != a) {
                i++;
            }

            if(i == t.length()) {
                return false;
            }

            i++;
        }

        return true;
    }
}
