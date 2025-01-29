class Solution {
        public int climbStairs(int n) {
            int last = 0;
            int prevlast = 0;
            if (n == 1) return 1;
            if (n == 2) return 2;
            for (int i = 1; i < n; i++) {
                if (last != 0 && prevlast != 0) {
                    int buf = last;
                    last = last + prevlast;
                    prevlast = buf;
                } else {
                    prevlast = last;
                    if (last == 0) last = 1;
                    last = last + prevlast;
                }
            }
            return last + prevlast;
        }
}