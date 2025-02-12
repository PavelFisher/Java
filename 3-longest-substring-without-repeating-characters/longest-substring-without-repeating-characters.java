class Solution {
    public int lengthOfLongestSubstring(String s) {
                    int maxLength = 0;
            LinkedList<Character> list = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (!list.contains(c)) list.addLast(c);
                else {
                    do {
                        list.removeFirst();
                    } while (list.contains(c));
                    list.addLast(c);
                }
                maxLength = Math.max(maxLength, list.size());
            }
            return maxLength;
    }
}