class Solution {
        public String addBinary(String a, String b) {
            int dec = 0;
            String res = "";
            for (int i = 0; i <= Math.max(a.length(), b.length()); i++) {

                if (a.length() - i - 1 >= 0) dec = dec + Character.getNumericValue(a.charAt(a.length() - i - 1));
                if (b.length() - i - 1 >= 0) dec = dec + Character.getNumericValue(b.charAt(b.length() - i - 1));
                if (i > a.length() - 1 && i > b.length() - 1 && dec == 0) break;
                switch (dec) {
                    case 0:
                        res = "0" + res;
                        break;
                    case 1:
                        res = "1" + res;
                        dec = 0;
                        break;
                    case 2:
                        res = "0" + res;
                        dec = 1;
                        break;
                    case 3:
                        res = "1" + res;
                        dec = 1;
                        break;
                }
            }
            return res;
        }
}