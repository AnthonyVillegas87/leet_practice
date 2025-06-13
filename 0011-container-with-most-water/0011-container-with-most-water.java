class Solution {
    public int maxArea(int[] height) {
        //Two Pointer Pattern
        int maxArea = 0;
        int pointerA = 0;
        int pointerB = height.length - 1;
        
        while(pointerA < pointerB) {
            if(height[pointerA] < height[pointerB]) {
                maxArea = Math.max(maxArea, height[pointerA] * (pointerB - pointerA));
                pointerA += 1;
            } else {
                 maxArea = Math.max(maxArea, height[pointerB] * (pointerB - pointerA));
                pointerB -= 1;
            }
        }
        return maxArea;
    }
}