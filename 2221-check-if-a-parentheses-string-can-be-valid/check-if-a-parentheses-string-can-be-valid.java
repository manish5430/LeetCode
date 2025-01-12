class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length() %2 != 0) return false;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> unlocked = new Stack<>();
        
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            char state = locked.charAt(i);

            if(state == '0')  unlocked.push(i);
            else if(ch == '(') stack.push(i);
            else{
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