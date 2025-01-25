class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = s.length();
        int j = t.length();

        if(t.length() < s.length()) return false;
        
        while(i > 0 && j > 0){
            if(s.charAt(i -1) == t.charAt(j-1)){
                i--;
                j--;
            }else{
                j--;
            }
        }
        return (i == 0);
    }
}