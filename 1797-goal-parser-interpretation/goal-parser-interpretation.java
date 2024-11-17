class Solution {
    public String interpret(String command) {
        String ans = command.replace("()", "o").replace("(al)", "al");
        return ans;
    }
}