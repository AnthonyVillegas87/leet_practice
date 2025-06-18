class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for(String p : path.split("/")) {
            if(p.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else if(!p.equals(".") && !p.isEmpty()) {
                stack.push(p);
            }
        }

        return "/" + String.join("/", stack);
    }
}