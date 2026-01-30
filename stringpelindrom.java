class Solution {
    public boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String st = str.toUpperCase();
        char[] arr = st.toCharArray();

        int i = 0;
        int c = arr.length - 1;

        while (i < c) {
            if (arr[i] != arr[c]) {
                return false;
            }
            i++;
            c--;
        }
        return true;
    }
}
