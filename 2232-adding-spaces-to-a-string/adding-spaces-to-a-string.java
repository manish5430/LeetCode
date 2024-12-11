class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        StringBuilder sb = new StringBuilder();
        int index =0;
        for(int i : spaces){
                sb.append(s.substring(index , i)).append(" ");
                index = i;
        }
        sb.append(s.substring(index , s.length()));
        return sb.toString();
    }
}