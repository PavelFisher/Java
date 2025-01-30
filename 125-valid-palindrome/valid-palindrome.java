class Solution {
 public boolean isPalindrome(String s) {
            String value = s.trim().toLowerCase();
            if (value.isEmpty()) return true;
            do {
                if (!Character.isLetter(value.charAt(0)) && !Character.isDigit(value.charAt(0))) {
                    value = value.substring(1, value.length());
                    continue;
                }
                if (!Character.isLetter(value.charAt(value.length() - 1)) && !Character.isDigit(value.charAt(value.length() - 1))) {
                    value = value.substring(0, value.length() - 1);
                    continue;
                }
                if (value == "" || value.length() == 1)
                    return true;
                if (value.charAt(value.length() - 1) != value.charAt(0)) return false;
                value = value.substring(1, value.length());
                value = value.substring(0, value.length() - 1);
            } while (value != "");

            if (value == "") {
                return true;
            } else return false;
        }
    }
