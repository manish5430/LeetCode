class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];

        for(int i = 0; i< n+1; i++){   // j == 0 s2 is empty so need to delete all char
            dp[i][0] = i;
        }
        for(int j = 0; j< m+1; j++){  // i == 0 need to insert all characters
            dp[0][j] = j;
        }

        for(int i = 1; i< n+1; i++){
            for(int j = 1; j< m+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], 
                                   Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}