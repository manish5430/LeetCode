class Solution {
    public int countArrangement(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        ArrayList<List<Integer>> result1 = recursion(n, new ArrayList<Integer>(), dp);
        return result1.size();       
        
    }

    static ArrayList<List<Integer>> recursion(int n, ArrayList<Integer> list, int[] dp){
        ArrayList<List<Integer>> result = new ArrayList<>();
        
        if(list.size() == n){
            result.add(new ArrayList<>(list));
            return result;
        }

        for(int i = 0; i< n; i++){
            int num = i+1;
            int index = list.size() +1;
            if((num % index == 0  || index % num == 0) && dp[i] == -1){
                dp[i] = 0;
                list.add(num);
            
                result.addAll(recursion(n, list, dp));
                list.remove(list.size() -1);
                dp[i] = -1;
            }
        }
        return result;
    }
}