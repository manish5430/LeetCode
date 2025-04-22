class StockSpanner {

    Stack<Integer> stack;
    ArrayList<Integer> list;

    public StockSpanner() {
        stack = new Stack<>();
        list = new ArrayList<>();
        
    }
    
    public int next(int price) {

        list.add(price);     // we could have done this without arraylist element adding and its index if they have given us a simple array but its dynamic thye are giving just one element at a time   not the whole array   thats why we need to  keep trace of index somehow by adding the each element in list to get its index 

        while(!stack.isEmpty() && list.get(stack.peek()) <= price){
            stack.pop();
        }
        int index1 = 0;
        if(stack.isEmpty())  index1 = -1;
        else index1 = stack.peek();   // just the index of it 

        int index2 = list.size() -1;   // we r storing every number in list without removing 

        stack.push(index2);   // this is just normal index of that number 
        // we are pshing every element index   okay 
        // rmeoving thing is done separately in while loop 

        int ans = index2 - index1;

        return ans;        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */