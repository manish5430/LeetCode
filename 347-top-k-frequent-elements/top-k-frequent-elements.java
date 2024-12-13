class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        int i = 0;
        while(i < k){
            int max = 0;
            int maxKey = 0;
            
            for(int num : map.keySet()){
                if(map.get(num) > max){
                    max = map.get(num);
                    maxKey = num;
                }
            }
            list.add(maxKey);
            map.remove(maxKey);

            i++;
        }

        return list.stream().mapToInt(Integer :: intValue).toArray();

    }
}