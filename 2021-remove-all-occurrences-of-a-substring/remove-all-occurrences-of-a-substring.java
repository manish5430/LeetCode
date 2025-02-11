class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();

        for(int i = 0; i< n; i++){
            sb.append(s.charAt(i));
            if(sb.length() >= m){
                String s1 = sb.substring(sb.length() -m);  // last part length string 
                if(s1.equals(part)){
                    sb.setLength(sb.length() - m);
                }
            }
        }
        return sb.toString();        
    }
}