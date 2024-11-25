class Solution {
    public String mergeAlternately(String word1, String word2) {
        ArrayList<Character> list = new ArrayList<>();
        int i = 0;
        while( i < word1.length() && i< word2.length()){
            list.add(word1.charAt(i));
            list.add(word2.charAt(i));
            i++;
        }

        while(i < word2.length()){
            list.add(word2.charAt(i));
            i++;
        }

        while(i< word1.length()){
            list.add(word1.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}