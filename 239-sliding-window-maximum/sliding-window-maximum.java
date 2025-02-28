class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        int n = nums.length;
        int index = 0 ;
        while(index < k){
            while(! deque.isEmpty() && nums[deque.peekLast()] <= nums[index]){
                deque.pollLast();
            }
            deque.offerLast(index);
            index++;
        }
        list.add(nums[deque.peekFirst()]);

        for(int left = 1; left< n -k+1; left++){
            if(! deque.isEmpty() && deque.peekFirst() < left){
                deque.pollFirst();
            }

            while(! deque.isEmpty() && nums[deque.peekLast()] <= nums[left+ k-1]){
                deque.pollLast();
            }
            deque.offerLast(left+k-1);
            list.add(nums[deque.peekFirst()]);
        }
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}