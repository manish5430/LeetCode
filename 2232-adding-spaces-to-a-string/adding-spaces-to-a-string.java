class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int n = 0;
        int i = 0;
        while(n < s.length()  && i< spaces.length){
            sb.append(s.substring(n, spaces[i]));
            sb.append(" ");

            n = spaces[i];
            i++;
        }
       
        sb.append(s.substring(n));

        return sb.toString();   
    }
}