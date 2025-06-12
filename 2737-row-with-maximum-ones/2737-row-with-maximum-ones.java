class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesIndex = 0, maxOnesCount = 0;

        for(int i = 0; i < mat.length; i++) {
            int value = 0;
            for(int j = 0; j < mat[0].length; j++) {
                    value += mat[i][j];
            
            }

            if(value > maxOnesCount) {
                maxOnesIndex = i;
                maxOnesCount = value;
            }
        }
        return new int[] {maxOnesIndex, maxOnesCount};

    }
}