class Solution {
    public String longestCommonPrefix(String[] strs) {

        ArrayList<char[]> list = new ArrayList<>();
        for (String s : strs) list.add(s.toCharArray());

        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (true) {
            if (i >= list.get(0).length) break;

            char ch = list.get(0)[i];

            for (int j = 1; j < list.size(); j++) {
                if (i >= list.get(j).length || list.get(j)[i] != ch)
                    return ans.toString();
            }

            ans.append(ch);
            i++;
        }
        return ans.toString();
    }
}
