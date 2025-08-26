class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> jewelSet = new HashSet<>();

        for(char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        for(char stone : stones.toCharArray()) {
            if(jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}