class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0) return ans;
        if (strs[0].isEmpty()) return ans;

        for (int i = 0; i < 200; i++) {
            if (strs[0].length() < i + 1) return ans;
            char symbol = strs[0].charAt(i);
            for (String s : strs) {
                if (s.isEmpty()) return "";
                if (s.length() < i + 1) return ans;
                if (symbol != s.charAt(i)) return ans;
            }
            ans = ans + symbol;
        }
        return ans;
    }
}