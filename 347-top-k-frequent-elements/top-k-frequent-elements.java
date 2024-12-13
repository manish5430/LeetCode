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

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            list.add(maxKey);
            map.remove(maxKey);
            i++;
        }

        return list.stream().mapToInt(Integer :: intValue).toArray();

    }
}