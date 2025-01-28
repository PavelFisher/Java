class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            if (target <= nums[0]) return 0;
            else if (target == nums[nums.length - 1]) return nums.length - 1;
            else if (target > nums[nums.length - 1]) return nums.length;
            while (left <= right) {
                int center = left + ((right - left) / 2);
                if (right - left == 1) {
                    if (nums[left] < target || nums[right] == target) return left + 1;
                    else return left;
                } else if (nums[center] > target) right = right - Math.max((right - left) / 2, 1);
                else if (nums[center] < target) left = left + Math.max((right - left) / 2, 1);
                else return center;
            }
            return left;
        }
}