class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') stack.push(i);
            else if(ch == '*') unlocked.push(i);
            else{   // opening bracket
                if(!stack.isEmpty()) stack.pop();
                else if(!unlocked.isEmpty()) unlocked.pop();
                else return false;
            }
        }

        while(!stack.isEmpty() && !unlocked.isEmpty() && stack.peek() < unlocked.peek()){
            stack.pop();
            unlocked.pop();
        }
        return (stack.isEmpty());
    }
}