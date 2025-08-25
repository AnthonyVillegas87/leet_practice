class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        Map<Character, Integer> charCounts = new HashMap<>();

        for(char c : s.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (int count : charCounts.values()) {
            length += (count / 2) * 2;
        } 

        if(length < s.length()) {
            length++;
        }

        return length;

    }
}