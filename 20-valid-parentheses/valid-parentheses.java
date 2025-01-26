class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            Map<Character, Character> mapping = new HashMap<>();
            mapping.put(')', '(');
            mapping.put('}', '{');
            mapping.put(']', '[');

            for (char c : s.toCharArray()) {
                if (mapping.containsValue(c)) {
                    stack.push(c);
                } else if (mapping.containsKey(c)) {
                    if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
        // public boolean isValid(String s) {
        //     String subS = s.trim();
        //     if (s.length() % 2 > 0) return false;
        //     while (subS.length() > 0) {
        //         int checkLength = subS.length();
        //         subS = subS.replace("()", "");
        //         subS = subS.replace("{}", "");
        //         subS = subS.replace("[]", "");
        //         if (subS.length() == checkLength) return false;
        //     }
        //     return true;
        // }
}