class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            int lastIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    k++;
                    nums[lastIndex] = nums[i];
                    lastIndex++;
                }
            }
            return k;
        }
}