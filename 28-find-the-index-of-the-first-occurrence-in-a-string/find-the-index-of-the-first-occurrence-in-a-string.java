class Solution {
  public int strStr(String haystack, String needle) {
//            index = haystack.indexOf(needle);
            LinkedList<Character> haystackChars = new LinkedList<Character>();
            LinkedList<Character> needleChars = new LinkedList<Character>();
            int index = -1;
            int indexN = 0;
            if (haystack.length() < needle.length()) return -1;
            for (int i = 0; i < needle.length(); i++) needleChars.addLast(needle.charAt(i));
            for (int i = 0; i < haystack.length(); i++) {
                if (i < needle.length()) {
                    haystackChars.addLast(haystack.charAt(i));
                    continue;
                } else if (haystackChars.equals(needleChars)) {
                    if (index < 0) index = 0;
                    return indexN;
                } else {
                    haystackChars.removeFirst();
                    haystackChars.addLast(haystack.charAt(i));
                    indexN++;
                }
                ;
            }
            if (haystackChars.equals(needleChars)) return indexN;
            else return -1;
        }
}