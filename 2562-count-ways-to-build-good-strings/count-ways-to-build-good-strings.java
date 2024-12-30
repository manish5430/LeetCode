class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int maxLen = high + Math.max(zero, one);
        int[] dp =  new int[maxLen +1];

        Arrays.fill(dp, -1);

        return recursion(low, high, zero, one, 0, dp);       
    }

    static int recursion(int low, int high, int zero, int one, int len, int[] dp){
        if(len > high){
            dp[len] = 0;
            return 0;
        }

        if(dp[len] != -1){   // if it try to rotate 
            return dp[len];
        }

        int zeroLen = len + zero;   //  adding zeri to original empty len 
        int oneLen = len + one;
       
        int zeroCount = (zeroLen >= low && zeroLen <= high) ? 1 : 0;
        int oneCount = (oneLen >= low && oneLen <= high) ? 1 : 0;

        int ans = zeroCount + recursion(low, high, zero, one, zeroLen, dp) +
                  oneCount + recursion(low, high, zero, one, oneLen, dp);

        dp[len] = ans % (1000000007);

        return dp[len];
    }
}