class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        for(int i = 0; i< s2.length(); i++){
            for(int j = 0; j< s2.length(); j++){
                
                if(s1.equals(swap(s2, i, j))){
                    return true;
                }
            }
            
        }

        for(int i = 0; i< s1.length(); i++){
            for(int j = 0; j< s1.length(); j++){
                
                if(swap(s1, i, j).equals(s2)){
                    return true;
                }
            }
            
        }
        return false;
        
    }

    static String swap(String s1, int i, int j){
        StringBuilder sb = new StringBuilder(s1);
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
        return sb.toString();      
    }
}