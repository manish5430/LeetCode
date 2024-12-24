class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] s1arr = s1.toCharArray();
        Arrays.sort(s1arr);
        String s1str = new String(s1arr);

        for(int i = 0; i<= s2.length()-s1.length(); i++){
            String substring = s2.substring(i, i+s1.length());
            char[] s2arr = substring.toCharArray();
            Arrays.sort(s2arr);
            String s2str = new String(s2arr);

            if(s1str.equals(s2str)) return true;
        }
        return false;
        
    }
}