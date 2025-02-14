class Solution {
    public int singleNumber(int[] nums) {
                    Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i == 0 && (nums.length == 1 || nums[0] != nums[1])) return nums[0];
                else if (nums[i] != nums[i + 1] && i == nums.length - 2) return nums[i + 1];
                else if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) return nums[i];
            }
            return 0;
    }
}