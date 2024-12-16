class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i<s.length(); i++){
            for(int j = i; j< s.length(); j++){
                if( isPalindrome(s, i, j)){
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isPalindrome(String s, int left, int right){
       while( left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}