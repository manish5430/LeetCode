class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        boolean[][] p = new boolean[n][n];

        for(int i = 0; i< n; i++){  // diagionally in matrix each char itself palindrome
            p[i][i] = true;  
        }

        for(int l = 2; l <= n; l++){
            for(int i = 0; i< n-l+1; i++){
                int j = i + l -1;

                if(l == 2){
                    p[i][j] = (s.charAt(i) == s.charAt(j));
                }else{
                    p[i][j] = (s.charAt(i) == s.charAt(j) && p[i+1][j-1]);
                }
            }
        }

        // now filling dp[] 
        for(int i = 0; i< n; i++){
            if(p[0][i]){
                dp[i] = 0;
            }
            else{
                dp[i] = Integer.MAX_VALUE;
                for(int k = 0; k< i; k++){
                    if(p[k+1][i] &&  1 + dp[k] < dp[i]){
                        dp[i] = 1 + dp[k];
                    }
                }
            }
        }
        return dp[n-1];
    }
}