class Solution {

    public int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        // [8,2,3,4,6], k = 2
        
        for (int num : nums) {
            seen.add(num);
        }
        int ans = k;
        while (seen.contains(ans)) {
            ans += k;
        }
        return ans;
    }
}