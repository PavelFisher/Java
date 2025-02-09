class Solution {
    public char findTheDifference(String s, String t) {
                    Stack<Character> stack = new Stack<>();
            for (char c : t.toCharArray()) stack.add(c);
            for (char c : s.toCharArray()) stack.remove(stack.indexOf(c));
            return stack.pop();
    }
}