class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        HashSet<Integer> set = new HashSet<>();

        int lastday = days[days.length -1] +30; // extreme end possibility 
        int[] dp = new int[lastday +1];    // to include this last day 
        Arrays.fill(dp, -1);

        for(int n : days){
            set.add(n);
        }

        //return recursion(days, costs, days[0]);  
        return recursion(dp, days, costs, days[0], set);     
    }

    static int recursion(int[] dp, int[] days, int[] costs, int day, HashSet<Integer> set){

        if(day > days[days.length -1]){
            dp[day] = 0;
            return 0;
        }

        if(dp[day] != -1){
            return dp[day];
        }

        if(!set.contains(day)){
            dp[day] = 0 + recursion(dp, days, costs, day +1, set);
            return dp[day];
        }

        int cost1 = costs[0] + recursion(dp, days, costs, day+1, set);
        int cost2 = costs[1] + recursion(dp, days, costs, day+7, set);
        int cost3 = costs[2] + recursion(dp, days, costs, day+30, set);

        dp[day] =  Math.min(cost1, Math.min(cost2, cost3));

        return dp[day];
    }
}