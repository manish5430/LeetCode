class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");

        int i = 0; 
        int j = s.length() -1;

        while(i <= j){
            if( s.charAt(i) != s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
    return true;
    }
}