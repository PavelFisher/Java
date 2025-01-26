class Solution {
        public boolean isValid(String s) {
            char[][] brackets = {{'(', ')'}, {'{', '}'}, {'[', ']'}};
            String subS = s.trim();
            if (s.length() % 2 > 0) return false;
            while (subS.length() > 0) {
                boolean check = false;
                for (int i = 0; i < subS.length() - 1; i++) {
                    if (subS.charAt(i) == brackets[0][0] && subS.charAt(i + 1) == brackets[0][1] ||
                            subS.charAt(i) == brackets[1][0] && subS.charAt(i + 1) == brackets[1][1] ||
                            subS.charAt(i) == brackets[2][0] && subS.charAt(i + 1) == brackets[2][1]) {
                        if (subS.length() == 2) return true;
                        subS = subS.substring(0, i) + subS.substring(i + 2, subS.length());
                        check = true;
                    }
                }
                if (!check) return false;
            }
            return false;
        }
}