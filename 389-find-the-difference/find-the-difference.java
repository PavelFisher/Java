class Solution {
    public char findTheDifference(String s, String t) {
            for (char cs : s.toCharArray()) {
                for (int i = 0; i < t.length(); i++)
                    if (t.charAt(i) == cs) {
                        t = t.replaceFirst(String.valueOf(cs), "");
                        break;
                    }
            }
            t = t.trim();
            return t.charAt(0);
    }
}