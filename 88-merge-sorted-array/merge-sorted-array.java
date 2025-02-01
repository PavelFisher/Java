class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] nums1Copy = nums1.clone();
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < m + n; i++) {
                if (num1 < m && num2 < n) {
                    if (nums1Copy[num1] < nums2[num2]) {
                        nums1[i] = nums1Copy[num1];
                        num1++;
                    } else {
                        nums1[i] = nums2[num2];
                        num2++;
                    }
                } else if (num1 < m) {
                    nums1[i] = nums1Copy[num1];
                    num1++;
                } else if (num2 < n) {
                    nums1[i] = nums2[num2];
                    num2++;
                } else break;
            }
        }
}