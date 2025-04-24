class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') stack.push('(');
            else {
                if(c == ')' && stack.isEmpty()){
                    stack.push(')');
                }
                else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else if(c == ')' && !stack.isEmpty() && stack.peek() == c){
                    stack.push(')');
                }
            }
            
        }

        return stack.size();        
    }
}