class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int resultIndex = 0;

        for(int i = 0; i < n; i++) {
            while(!dq.isEmpty() && dq.peek() < i - k + 1) 

                dq.poll();

            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()])
                dq.pollLast();

                dq.offer(i);

                if(i >= k - 1)
                result[resultIndex++] = nums[dq.peek()];
        }
        return result;
    }
}