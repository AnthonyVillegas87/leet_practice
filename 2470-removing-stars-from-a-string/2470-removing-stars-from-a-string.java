class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()) {
            if(c == '*' && !stack.isEmpty()) {
                stack.pop();
            } else if (c != '*'){
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}