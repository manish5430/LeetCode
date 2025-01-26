class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];

        dp[0][0] = true;
        for(int i = 1; i< n+1; i++){
            dp[i][0] = false;
        }

// p can only match if all characters in p UP TO position j are '*'.
        for(int j = 1; j< m+1; j++){
            if(p.charAt(j-1) != '*'){
                dp[0][j] = false;
            }
            else dp[0][j] = dp[0][j-1];  // if all the char are * keep using true 
        }                             // if any one is not * make it false and proceed with it

        for(int i = 1; i< n+1; i++){
            for(int j = 1; j< m+1; j++){
                if((s.charAt(i-1) == p.charAt(j-1)) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];  // diagonally 0, 0 true proceed 
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
        
    }
}