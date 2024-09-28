class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        if( sentence.length() < 26) return false;

        for(char ch : sentence.toCharArray()){
            if( ch>= 'a' && ch<= 'z'){
               set.add(ch);
            }
        }

        if(set.size() == 26){
            return true;
        }
        return false;        
    }
}