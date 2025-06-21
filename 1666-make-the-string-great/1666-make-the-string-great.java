class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && Character.toLowerCase(stack.peek()) == Character.toLowerCase(c)
            && !stack.peek().equals(c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}