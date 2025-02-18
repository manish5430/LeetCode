class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;

        for(int i= 0; i< n; i++){
            if(! deque.isEmpty() && deque.peekFirst() <= i-k){
                deque.pollFirst();
            }
            while(! deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
                deque.pollLast();
            }
            deque.offer(i);

            if(i >= k-1){
                list.add(nums[deque.peekFirst()]);
            }
        }
        return list.stream().mapToInt(Integer :: intValue).toArray();
        
    }
}