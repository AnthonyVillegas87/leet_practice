class Solution {
    public int maxNumberOfBalloons(String text) {
      Map<Character, Integer> textCounts = new HashMap<>();

      for(char c : text.toCharArray()) {
        textCounts.put(c, textCounts.getOrDefault(c, 0) + 1);
      }

      Map<Character, Integer> balloonCounts = new HashMap<>();
      balloonCounts.put('b', 1);
      balloonCounts.put('a', 1);
      balloonCounts.put('l', 2);
      balloonCounts.put('o', 2);
      balloonCounts.put('n', 1);

       int minCount = Integer.MAX_VALUE;

       for(Map.Entry<Character, Integer> entry : balloonCounts.entrySet()) {
        char character = entry.getKey();
        int balloonFrequency = entry.getValue();

        int textFrequency = textCounts.getOrDefault(character, 0);

        int possibleBalloons = textFrequency / balloonFrequency;

        minCount = Math.min(minCount, possibleBalloons);
       }

       return minCount;
    }
}