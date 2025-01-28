class Solution {
        public int[] plusOne(int[] digits) {
            int[] res = new int[digits.length + 1];
            for (int i = res.length - 1; i >= 0; i--) {
                if (i == 0) {
                    res[0] = 1;
                    return res;
                } else if (digits[i - 1] + 1 > 9) {
                    digits[i - 1] = 0;
                    res[i] = 0;
                } else {
                    digits[i - 1] += 1;
                    return digits;
                }
            }
            return res;
        }
}