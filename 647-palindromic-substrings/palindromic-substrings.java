class Solution {
    public int countSubstrings(String s) {
        int ans = 0;

        for(int i = 0; i< s.length(); i++){
            
            ans += Palindrome(s, i, i+1);
            ans += Palindrome(s, i, i);
        }
        return ans;
    }

    static int Palindrome(String s, int i, int j){
        int count = 0;
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){           
            count++;
            i--;
            j++;
        }
        return count;
    }
}