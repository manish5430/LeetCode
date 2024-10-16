class Solution {
    public String restoreString(String s, int[] indices) {
        char[] name = new char[s.length()];

        for(int i=0; i< s.length(); i++){
            name[indices[i]] = s.charAt(i);
        }
        return new String(name);
    
    }
}