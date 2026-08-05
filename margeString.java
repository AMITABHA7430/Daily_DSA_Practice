class Solution {
    public String mergeAlternately(String word1, String word2) {
String word3 = word1.replaceAll("\\d", "");
String word4 = word2.replaceAll("\\d", "");

int n = word3.length();
int m = word4.length();

int i = 0, j = 0, k = 0;
char[] a = new char[n + m];

while (i < n && j < m) {
    a[k++] = word3.charAt(i++);
    a[k++] = word4.charAt(j++);
}

while (i < n) {
    a[k++] = word3.charAt(i++);
}

while (j < m) {
    a[k++] = word4.charAt(j++);
}

return String.valueOf(a);

}
}
