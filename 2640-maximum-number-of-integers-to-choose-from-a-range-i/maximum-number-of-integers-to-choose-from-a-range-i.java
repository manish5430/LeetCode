class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        // ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num : banned ){
            set.add(num);
        }

       // Collections.sort(set);

        int i = 1;
        int sum = 0;
        int count = 0;
        while(i <= n && sum <= maxSum){
            if(!set.contains(i)){
                sum += i;
                if(sum <= maxSum){
                    count++;
                }                
            }
            i++;
        }
        
        return count;        

    }
}