class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!contains(nums2, nums1[i]) && !a.contains(nums1[i])) {
                a.add(nums1[i]);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!contains(nums1, nums2[i]) && !b.contains(nums2[i])) {
                b.add(nums2[i]);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();

        answer.add(a);
        answer.add(b);

        return answer;
    }

    public boolean contains(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}
