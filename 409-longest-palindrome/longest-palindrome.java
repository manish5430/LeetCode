class Solution {
    public int longestPalindrome(String s) {
        int[] freqArr = new int[2000];
        for(char c : s.toCharArray()){
            freqArr[c]++;
        }   
        int ans = 0;
        int oddcount = 0;

        for(int n : freqArr){
            if(n % 2 == 0){
                ans += n;
            }else{
                ans += n-1;
                oddcount = 1;
            }
        }
        return ans + oddcount;        
    }
}