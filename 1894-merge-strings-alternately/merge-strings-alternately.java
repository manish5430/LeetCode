class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        char[] name = new char[a + b];

        int i = 0, j = 0, z = 0;

        while (j < a && z < b) {
            name[i++] = word1.charAt(j++); 
            name[i++] = word2.charAt(z++); 
        }

        while (j < a) {
            name[i++] = word1.charAt(j++); 
        }

        while (z < b) {
            name[i++] = word2.charAt(z++); 
        }
        
        return new String(name); 
    }
}
