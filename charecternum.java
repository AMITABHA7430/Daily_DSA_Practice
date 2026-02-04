class Solution {
    public int compress(char[] chars) {

        List<Character> lst1 = new ArrayList<>();
        List<Character> lst2 = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            lst1.add(chars[i]);
        }

        for (int i = 0; i < lst1.size(); ) {
            char ch = lst1.get(i);
            int c = 0;

            for (int j = i; j < lst1.size(); ) {
                if (lst1.get(j) == ch) {
                    c++;
                    lst1.remove(j);
                } else {
                    break;
                }
            }

            lst2.add(ch);

            if (c > 1) {
                String num = String.valueOf(c);
                for (int k = 0; k < num.length(); k++) {
                    lst2.add(num.charAt(k));
                }
            }
        }

        for (int i = 0; i < lst2.size(); i++) {
            chars[i] = lst2.get(i);
        }

        return lst2.size();
    }
}
