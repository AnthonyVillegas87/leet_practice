class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> dq = new LinkedList<>();
        for(char c : s.toCharArray()) {
            dq.addLast(c);
        }

        while(dq.size() > 1) {
            if(!dq.pollFirst().equals(dq.pollLast())) {
                return false;
            }
        }
        return true;
    }
}