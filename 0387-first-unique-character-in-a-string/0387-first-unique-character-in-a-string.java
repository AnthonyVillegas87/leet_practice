class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(charCounts.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }
}