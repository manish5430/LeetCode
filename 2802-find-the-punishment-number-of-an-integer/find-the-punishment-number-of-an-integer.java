class Solution {
    public int punishmentNumber(int n) {
        int punishmentNum = 0;
        for (int num = 1; num <= n; num++) {
            int squareNum = num * num;
            String s = Integer.toString(squareNum);
            
            int[][] dp = new int[s.length()][num + 1];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            
            if (check(0, 0, s, num, dp)) {
                punishmentNum += squareNum;
            }
        }
        return punishmentNum;
    }

    static boolean check(int i, int sum, String s, int num, int[][] dp) {
        if (i == s.length()) {
            return sum == num;
        }
        if (sum > num) return false;

        if (dp[i][sum] != -1) return dp[i][sum] == 1;

        boolean possible = false;

        for (int j = i; j < s.length(); j++) {
            String str = s.substring(i, j + 1);
            int addend = Integer.parseInt(str);
            
            possible = possible || check(j + 1, sum + addend, s, num, dp);
            if (possible) {
                dp[i][sum] = 1;
                return true;  // Corrected: Return true once possible is found
            }
        }
        
        dp[i][sum] = 0;  // Corrected: Mark as impossible
        return false;
    }
}
