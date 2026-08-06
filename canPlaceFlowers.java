class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {

        int i = 0;
        int c = 0;

        while (i < f.length) {

            if (f[i] == 0) {

                if ((i == 0 || f[i - 1] == 0) &&
                    (i == f.length - 1 || f[i + 1] == 0)) {

                    c++;
                    f[i] = 1;
                    i = i + 2;
                } else {
                    i++;
                }

            } else {
                i++;
            }
        }

        if (c >= n) {
            return true;
        } else {
            return false;
        }
    }
}
