class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i == j || i == k || j == k) break;
                    if (Math.abs(ans - target) > (Math.abs(nums[i] + nums[j] + nums[k] - target)))
                        ans = nums[i] + nums[j] + nums[k];
                }
            }
        }
        return ans;
    }
}