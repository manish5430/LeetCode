class Solution {
    public int numWays(String[] words, String target) {
        int wordLen = words[0].length();
        int targetLen = target.length();
        int charFreq[][] = new int[wordLen][26];
        
        for(String word : words){
            for(int i=0;i<word.length();i++){
                int charIndex = word.charAt(i) - 'a';
                charFreq[i][charIndex]++;
            }
        }
        long dp[][] = new long[wordLen+1][targetLen+1];
        for(int i=0;i<wordLen+1;i++){
            Arrays.fill(dp[i], -1);
        }
        return (int)recur(0,0,charFreq, target, words, dp);
    }

    long recur(int wordIndex, int targetIndex, int charFreq[][], String target, String words[], long dp[][]){
        //base cases
        if(targetIndex == target.length()){
            dp[wordIndex][targetIndex] = 1;
            return 1;
        } 
        if(wordIndex == words[0].length()){
            dp[wordIndex][targetIndex] = 0;
            return 0;
        }
        if((target.length() - targetIndex) > (words[0].length() - wordIndex)){
            dp[wordIndex][targetIndex] = 0;
            return 0;
        }
        if(dp[wordIndex][targetIndex]!=-1){
            return dp[wordIndex][targetIndex];
        }

        int curIndex = target.charAt(targetIndex) - 'a';
        int freq = charFreq[wordIndex][curIndex];

        long pick = freq * recur(wordIndex+1, targetIndex+1,charFreq,target,words, dp);
        long noPick = recur(wordIndex+1, targetIndex,charFreq,target,words, dp);
        long res = (pick + noPick)%1000000007;
        dp[wordIndex][targetIndex] = res;
        return res;

    }
}