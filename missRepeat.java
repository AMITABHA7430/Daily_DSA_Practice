class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> ami = new ArrayList<>();   // FIX 1
        int n = grid.length;
        int m = 1;
        int k = n * n;

        int mis = -1;    
        int rep = -1;    

        while (m <= k) {
            int c = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (m == grid[i][j]) {
                        c++;
                    }
                }
            }

            if (c > 1) {
                rep = m;
            }
            if (c == 0) {
                mis = m;
            }

            m++;
        }

        ami.add(rep);
        ami.add(mis);

        return new int[]{ami.get(0), ami.get(1)};   
    }
}
