class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() == goal.length()){
        return (s+s).contains(goal);
        }
        return false;
        
    }
}