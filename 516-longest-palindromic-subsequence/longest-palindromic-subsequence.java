class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1  = sb.reverse().toString();

        int m = s.length();
        int[][] dp = new int[m][m];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }

        return recursion(s, s1, m-1, m-1, dp);
    }

    static int recursion(String s1, String s2, int i, int j, int[][] dp){
        if(i< 0 || j< 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1 + recursion(s1, s2, i-1, j-1, dp);
        }
        else{
            return dp[i][j] = Math.max(recursion(s1, s2, i-1, j, dp), 
                                        recursion(s1, s2, i, j-1, dp));
        }
    }
}