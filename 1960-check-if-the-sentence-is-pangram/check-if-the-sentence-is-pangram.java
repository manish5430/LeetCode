class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        if(sentence.length() < 26) return false;

        char[] arr = sentence.toCharArray();
        for( char num : arr){
            if(num >= 'a'  &&  num <= 'z'){
                set.add(num);
            }
        }
        
        if(set.size() == 26){
            return true;
        }
        return false;
    }
}