class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(); 
        int n = text2.length();
        int[][] dp = new int[m][n];

        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }

        return lcs(text1, text2, m-1, n-1, dp);

    }

    static int lcs(String s1, String s2, int i, int j , int[][] dp){
        if(i< 0 || j< 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1+ lcs(s1, s2, i-1, j-1, dp);
        }
        
        return dp[i][j] = Math.max(lcs(s1, s2, i-1, j, dp), lcs(s1, s2, i, j-1, dp));
        
    }
}