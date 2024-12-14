class Solution {
    public int longestPalindromeSubseq(String s1) {
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();

        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return palindrome(s1, s2, m-1, n-1, dp);

    }

    static int palindrome(String s1, String s2, int i, int j, int[][] dp){
        if(i< 0 || j< 0) return 0;

        if(dp[i][j] != -1)  return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1 + palindrome(s1, s2, i-1, j-1, dp);
        }
        else{
            return dp[i][j] = Math.max(palindrome(s1, s2, i-1, j, dp), palindrome(s1, s2, i, j-1, dp));
        }
    }
}