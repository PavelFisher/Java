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
//  public List<String> letterCombinations(String digits) {
//             char[][] Symbols = {{'a', 'b', 'c'},
//                     {'d', 'e', 'f'},
//                     {'g', 'h', 'i'},
//                     {'j', 'k', 'l'},
//                     {'m', 'n', 'o'},
//                     {'p', 'q', 'r', 's'},
//                     {'t', 'u', 'v'},
//                     {'w', 'x', 'y', 'z'}};
//             ArrayList<String> comb = new ArrayList<String>();
//             if (digits.isEmpty()) return comb;
//             for (char i : Symbols[Character.getNumericValue(digits.charAt(0)) - 2]) {
//                 if (digits.length() >= 2) {
//                     for (char j : Symbols[Character.getNumericValue(digits.charAt(1)) - 2]) {
//                         if (digits.length() >= 3) {
//                             for (char k : Symbols[Character.getNumericValue(digits.charAt(2)) - 2]) {
//                                 if (digits.length() >= 4)
//                                     for (char l : Symbols[Character.getNumericValue(digits.charAt(3)) - 2]) {
//                                         comb.add(i + String.valueOf(j) + k + l);
//                                     }
//                                 else comb.add(i + String.valueOf(j) + k);

//                             }
//                         } else comb.add(String.valueOf(i) + j);
//                     }
//                 } else {
//                     comb.add(String.valueOf(i));
//                 }
//             }
//             return comb;
//         }
}