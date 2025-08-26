class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0, start = 0, end = 0;

        while(end < s.length()) {
            if(!charSet.contains(s.charAt(end))) {
                charSet.add(s.charAt(end));
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }

        }

        return maxLength;

    }
}