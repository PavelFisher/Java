class Solution {
  public static final Map<Integer, Character> romanNumbers = new HashMap<>(Map.of(
                1, 'I',
                2, 'V',
                3, 'X',
                4, 'L',
                5, 'C',
                6, 'D',
                7, 'M'
        ));

        public String intToRoman(int num) {
            String result = "";
            int counter = 1;
            do {
                switch (num % 10) {
                    case 1:
                        result = romanNumbers.get(counter) + result;
                        break;
                    case 2:
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter) + result;
                        break;
                    case 3:
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter) + result;
                        break;
                    case 4:
                        result = romanNumbers.get(counter + 1) + result;
                        result = romanNumbers.get(counter) + result;
                        break;
                    case 5:
                        result = romanNumbers.get(counter + 1) + result;
                        break;
                    case 6:
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter + 1) + result;
                        break;
                    case 7:
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter + 1) + result;
                        break;
                    case 8:
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter) + result;
                        result = romanNumbers.get(counter + 1) + result;
                        break;
                    case 9:
                        result = romanNumbers.get(counter + 2) + result;
                        result = romanNumbers.get(counter) + result;
                        break;
                }
                counter++;
                counter++;
                num = num / 10;
            } while (num > 0);
            return result;
        }
}