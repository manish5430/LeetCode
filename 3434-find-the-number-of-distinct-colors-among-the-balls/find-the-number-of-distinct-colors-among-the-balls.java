class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int n = queries.length;
        int[] result = new int[n];

        for(int i = 0; i< n; i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            if(! map1.containsKey(ball)){
                map1.put(ball, color);
                map2.put(color, map2.getOrDefault(color, 0) +1);                
            }
            else{
                int color1 = map1.get(ball);
                map2.put(color1, map2.getOrDefault(color1, 0) -1);   // minus the old color 
                if(map2.getOrDefault(color1, 0) == 0){
                    map2.remove(color1);
                }
                map1.put(ball, color);   // put it in map1 too
                map2.put(color, map2.getOrDefault(color, 0) +1);  // add the new color
            }

            result[i] = map2.size();  // map2 size for i th query only 
        }
        return result;
    }
}