class Solution {
    public int removePalindromeSub(String s) {
        if(isPalindrome(s)) return 1;
        return 2;
        
    }
    static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}