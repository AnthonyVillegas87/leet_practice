class Solution {
    public int largestUniqueNumber(int[] nums) {
        int[] counts = new int[1001];

        for(int num : nums) {
            counts[num]++;
        }

        for(int i = 1000; i >= 0; i--) {
            if(counts[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}