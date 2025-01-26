class Solution {
        public boolean isValid(String s) {
            String subS = s.trim();
            if (s.length() % 2 > 0) return false;
            while (subS.length() > 0) {
                int checkLength = subS.length();
                subS = subS.replace("()", "");
                subS = subS.replace("{}", "");
                subS = subS.replace("[]", "");
                if (subS.length() == checkLength) return false;
            }
            return true;
        }
}