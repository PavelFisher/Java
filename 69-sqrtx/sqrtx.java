class Solution {
        public int mySqrt(int x) {
            double res = 1;
            do {
                res = (res + x / res) / 2;
            } while (Math.abs(res * res - x) > 0.4);
            return (int) res;
        }
}