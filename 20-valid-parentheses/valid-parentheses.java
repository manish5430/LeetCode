class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // see jab tak opening bracket hai tab tak simply push closing b of them in stack 
        // else if closing bracket aaya to check if stack is empty or not || the last pushed one is same as this new closing bracket or not   IF NOT  return false simply 
        // also its LIFO  last open first closed   jo sabse last mein open hoga vo sabse uper hoga stcak mein thats why stack.pop() != c works here 

        for(int c : s.toCharArray()){
            if( c == '(') stack.push(')');
            else if( c == '[') stack.push(']');
            else if( c == '{') stack.push('}');
            else if( stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();        
    }
}