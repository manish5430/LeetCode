class Solution {
    public int longestPalindrome(String s) {
        int[] freqArr = new int[1000];
        for(char c : s.toCharArray()){
            freqArr[c]++;
        }
        int count = 0;
        int oddcount = 0;

        for(int n : freqArr){
            if(n %2 == 0){
                count = count + n;
            }
            else{
                count += n -1;
                oddcount = 1;
            }
        }
        return count + oddcount;                
    }
}