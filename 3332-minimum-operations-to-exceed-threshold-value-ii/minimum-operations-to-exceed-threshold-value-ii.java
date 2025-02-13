class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for(int num : nums){
            heap.add((long)num);
        }

        int count = 0;

        while(heap.size() >= 2  &&  heap.peek() < k){
            long a = heap.poll();
            long b = heap.poll();
            long c = a *2 + b;

            heap.add(c);
            count++;
        }
        return count;        
    }
}