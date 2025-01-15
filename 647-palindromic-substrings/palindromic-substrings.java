class Solution {
    public int countSubstrings(String s) {
        int ans = 0;

        for(int i = 0; i< s.length(); i++){
            ans += palindrome(s, i, i);
            ans += palindrome(s, i, i+1);
        }
        return ans;        
    }
    
    static int palindrome(String s, int i, int j){
        int count = 0;

        while(i>= 0 && j< s.length() && s.charAt(i) == s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }
}