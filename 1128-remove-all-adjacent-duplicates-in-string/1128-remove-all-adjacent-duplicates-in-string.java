class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder concatenatedString = new StringBuilder();
        while(!stack.isEmpty()) {
            concatenatedString.insert(0, stack.pop());
        }

        return concatenatedString.toString();
    }
}