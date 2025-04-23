class MinStack {
    Stack<Long> stack;
    long minVal;

    public MinStack() {
        stack = new Stack<>();
        
    }
    
    public void push(int val) {
        long value = val;  // simply convertiing this int val into long 
        if(stack.isEmpty()){
            stack.push(value);
            minVal = value;
        }
        else{
            if(value < minVal){
                stack.push(2 * value - minVal);
                minVal = value;
            }
            else{
                stack.push(value);
            }
        }   
    }
    
    public void pop() {
        long top = stack.peek();
        if(top < minVal){
            minVal = 2 * minVal - top;
        }
         
        stack.pop();
        
    }
    
    public int top() {
        long top = stack.peek();
        if(top < minVal){
            return (int) minVal;
        }

        return (int) top;
        
    }
    
    public int getMin() {
        return (int) minVal;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */