class Solution {
    public int minChanges(String s) {
        int count = 0;
        char[] c = s.toCharArray();
        for(int i=0; i< c.length-1; i+= 2){
            if(c[i] != c[i+1]){
                count++;
            }
        }
        return count;   
        
    }
}