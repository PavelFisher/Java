class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 1;
            int lastIndex = 0;
            if (nums.length == 0) return 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    lastIndex++;
                    nums[lastIndex] = nums[i + 1];
                    k++;
                }
            }
            return k;
        }
}