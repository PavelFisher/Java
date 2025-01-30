class Solution {
        public boolean isPalindrome(String s) {
            String value = s.trim().toLowerCase();
            String rotate = "";
            String valueS = "";

            for (int i = value.length() - 1; i >= 0; i--) {
                if (Character.isLetter(value.charAt(i)) || Character.isDigit(value.charAt(i))) {
                    rotate = rotate.concat(String.valueOf(value.charAt(i)));
                    valueS = value.charAt(i) + valueS;
                }
            }
            if (valueS.equals(rotate)) {
                return true;
            } else return false;
        }
    }
