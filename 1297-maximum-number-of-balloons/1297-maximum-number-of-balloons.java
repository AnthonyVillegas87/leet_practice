class Solution {
    public int maxNumberOfBalloons(String text) {
        // Create a hashmap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        // Populate the hashmap with character frequencies from the string
        for (char c : text.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int minCount = Integer.MAX_VALUE;
        // Calculate the maximum number of times "balloon" can be formed
        minCount = Math.min(minCount, charCount.getOrDefault('b', 0));
        minCount = Math.min(minCount, charCount.getOrDefault('a', 0));
        minCount = Math.min(minCount, charCount.getOrDefault('l', 0) / 2);
        minCount = Math.min(minCount, charCount.getOrDefault('o', 0) / 2);
        minCount = Math.min(minCount, charCount.getOrDefault('n', 0));
        
        return minCount;
    }
}