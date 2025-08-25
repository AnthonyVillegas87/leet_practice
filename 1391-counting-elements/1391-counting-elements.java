class Solution {
    public int countElements(int[] arr) {
        int count = 0;
        Set<Integer> elementCount = new HashSet<>();

        for(int num : arr) {
            elementCount.add(num);
        }

        for(int num : arr) {
            if(elementCount.contains(num + 1)) {
                count++;
            }
        }

        return count;
    }
}