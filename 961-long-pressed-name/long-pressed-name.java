class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i= 0,j= 0;
        while( j < typed.length()){
            if( i<name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
            }else if( i>0 && name.charAt(i-1) == typed.charAt(j)){
               // leave it empty  
            }else{
                return false;
            }
            j++;
        }
        return i == name.length();
    }
}