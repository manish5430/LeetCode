class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] num : dp){
            Arrays.fill(num, -1);
        }

        return recursion(text1, text2, n-1, m-1, dp);
    }

    static int recursion(String s1, String s2, int i, int j, int[][] dp){
        // i j are indices  could be zero 
        if(i < 0 || j < 0) return 0; 
        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = 1 + recursion(s1, s2, i-1, j-1, dp);
        }else{
            dp[i][j] = Math.max(recursion(s1, s2, i-1, j, dp), recursion(s1, s2, i, j-1, dp));
        }

        return dp[i][j];
    }
}