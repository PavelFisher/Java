class Solution {
            private final char[][] Symbols = {{'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
                {'j', 'k', 'l'},
                {'m', 'n', 'o'},
                {'p', 'q', 'r', 's'},
                {'t', 'u', 'v'},
                {'w', 'x', 'y', 'z'}};

        public List<String> letterCombinations(String digits) {
            ArrayList<String> comb = new ArrayList<String>();
            if (digits.isEmpty()) return comb;
            addComb(0, new String(), comb, digits);
            return comb;
        }

        private void addComb(int symbol, String str, ArrayList<String> comb, String digits) {

            for (char i : Symbols[Character.getNumericValue(digits.charAt(symbol)) - 2]) {
                if (digits.length() == symbol + 1) comb.add(str + i);
                else addComb(symbol + 1, str + i, comb, digits);
            }
        }
}