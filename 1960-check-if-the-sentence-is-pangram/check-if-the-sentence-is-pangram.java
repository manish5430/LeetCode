class Solution {
    public boolean checkIfPangram(String sentence) {
        if( sentence.length() < 26)  return false;
        char[] word = sentence.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for(char c : word){
            set.add(c);
        }
        if( set.size() == 26)  return true;
        return false;                  
    }
}