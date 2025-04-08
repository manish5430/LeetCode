class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
            list.add(num);
        }

        if(n < 3 && map.size() != n) return 1;
        if(n == map.size()) return 0;
        
        int count = 0;
        while(map.size() < list.size()){
            for(int i = 0; i< 3 && !list.isEmpty(); i++){
                int val = list.get(0);
                map.put(val, map.getOrDefault(val, 0) -1);
                if(map.getOrDefault(val, 0) == 0) map.remove(val);
                list.remove(0);
            }
            count++;
        }
        return count;
        
    }
}