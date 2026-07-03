class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        seat(new ArrayList<>(), nums, l);
        return l;
    }

    public static void seat(List<Integer> ans, int[] nums, List<List<Integer>> l) {
        if (ans.size() == nums.length) {
            l.add(new ArrayList<>(ans));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!ans.contains(nums[i])) {
                ans.add(nums[i]);
                seat(ans, nums, l);
                ans.remove(ans.size() - 1); // backtracking
            }
        }
    }
}