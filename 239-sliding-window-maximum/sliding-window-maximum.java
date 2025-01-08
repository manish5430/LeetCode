class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n -k+1];
        if(nums.length == 0) return result;

    // to store indices only to add or remove
        Deque<Integer> deque = new ArrayDeque<>();  
        int index = 0;
        while(index < k){
            // if the new is larger than previous one remove all of them 
            while(! deque.isEmpty() && nums[deque.peekLast()] <= nums[index]){
                deque.pollLast();
            }
            deque.offerLast(index);  // add the new larger index only 
            index++;                 // just for initial window 
        }
        result[0] = nums[deque.peekFirst()];

        for(int i= 1; i< n - k+1; i++){
            // removing left indices as deque only contains indices 
            if(! deque.isEmpty() && deque.peekFirst() < i){
                deque.pollFirst();
            }
            // right element is i + k-1
            while(! deque.isEmpty() && nums[deque.peekLast()] <= nums[i +k-1]){
                deque.pollLast();
            }
            deque.offerLast(i +k-1);
            result[i] = nums[deque.peekFirst()];
        }
        
        return result;

    }
}