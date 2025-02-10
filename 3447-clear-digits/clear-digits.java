class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
            }
            else if(Character.isDigit(c)){
                if(! stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            char c = stack.pop();
            sb.append(c);
        }
        return sb.reverse().toString();
        
    }
}