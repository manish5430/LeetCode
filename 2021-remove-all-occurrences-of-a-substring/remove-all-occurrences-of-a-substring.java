class Solution {
    public String removeOccurrences(String s, String part) {
        if(!s.contains(part)){
            return s;
        }       
        return removeOccurrences(s.replaceFirst(part, ""), part);
    }
}