class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int[] sort = nums.clone();
        Arrays.sort(sort);

        ArrayList<Deque<Integer>> queue = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int mapIndex = 0;
        queue.add(new LinkedList<>());
        queue.get(mapIndex).offer(sort[0]);
        map.put(sort[0], mapIndex);

        for(int i = 1; i< nums.length; i++){
            if(sort[i] - queue.get(mapIndex).peekLast() > limit){
                mapIndex++;
                queue.add(new LinkedList<>());
            }
            map.put(sort[i], mapIndex);
            queue.get(mapIndex).offer(sort[i]);
        }

        for(int i = 0; i< nums.length; i++){
            int index = map.get(nums[i]);
            nums[i] = queue.get(index).poll();
        }

        return nums;
    }
}