class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        for(int[] interval : intervals){
            if(list.size() == 0){
                list.add(interval);
            }
            else{
                int[] preInterval = list.get(list.size()-1);  // last added interval
                if(preInterval[1] >= interval[0]){
                    preInterval[1] = Math.max(preInterval[1], interval[1]);
                }
                else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
        
    }
}