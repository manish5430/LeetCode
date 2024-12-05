class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        while(i < intervals.length){
            if(intervals[i][0] < newInterval[0]){
                list.add(intervals[i]);
                i++;
            }else{
                break;
            }
        }

        if(list.size() == 0  || list.get(list.size()-1)[1] < newInterval[0]){
            list.add(newInterval);
        }
        else{
            int[] preInterval = list.get(list.size()-1);
            preInterval[1] = Math.max(preInterval[1], newInterval[1]);
        }

        while(i < intervals.length){
            int[] preInterval = list.get(list.size()-1);
            if(preInterval[1] >= intervals[i][0]){
                preInterval[1] = Math.max(preInterval[1], intervals[i][1]);
            }
            else{
                list.add(intervals[i]);
            }
            i++;
        }

        return list.toArray(new int[list.size()][]);        
        
    }
}