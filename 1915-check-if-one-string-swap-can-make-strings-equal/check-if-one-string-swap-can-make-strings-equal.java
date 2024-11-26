class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        for(int i= 0; i< s1.length(); i++){
            for(int j = 0; j< s1.length(); j++){
                String s = swap(s1, i, j);
            
                if(s.equals(s2)){
                   return true;
                }
            }
        } 
        return false;       
    }
    static String swap(String s, int i, int j){
        StringBuilder sb = new StringBuilder(s);
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
        return sb.toString();

    }
}