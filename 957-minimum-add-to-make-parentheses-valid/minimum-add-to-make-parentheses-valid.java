class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(') stack.push('(');
            else {// c == ')'
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else  stack.push(')');
                
            }
            
        }

        return stack.size();        
    }
}