class Solution {
        public int strStr(String haystack, String needle) {
//            index = haystack.indexOf(needle);
            for (int i = needle.length() - 1; i < haystack.length(); i++) {
                String str = haystack.substring(i - (needle.length() - 1), i + 1);
                if (haystack.substring(i - (needle.length() - 1), i + 1).equals(needle))  return i - (needle.length() - 1);
            }
            return -1;
        }
}