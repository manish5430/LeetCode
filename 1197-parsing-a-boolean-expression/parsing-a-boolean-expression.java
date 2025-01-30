class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        int n = expression.length();

        for(int i = 0; i< n; i++){
            char ch = expression.charAt(i);
            if(ch == ')'){
                ArrayList<Character> list = new ArrayList<>();
                while(stack.peek() != '('){
                    list.add(stack.pop());
                }  
                stack.pop();  // just pop this ( without storing it 
                char op = stack.pop();  // store the operator
                
                char ans = evaluate(list, op);
                stack.push(ans);
            }
            else{
                if(ch != ','){
                    stack.push(ch);   // just push everything other than , 
                }
            }
        }
        // after everything 
        return stack.peek() == 't';
    }

    static char evaluate(ArrayList<Character> list, char op){
        if(op == '&'){
            for(char c : list){
                if(c == 'f') return 'f';
            }
            return 't';
        }
        else if(op == '|'){
            for(char c : list){
                if(c == 't') return 't';
            }
            return 'f';
        }
        else if(op == '!'){
            if(list.get(0) == 't') return 'f';
            else return 't';        
        }
        return 'f';
    }
}