class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;

        // nearest smaller left side 
        int[] nsl = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< n; i++){
            while(! stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }
            if(! stack.isEmpty())  nsl[i] = stack.peek();
            else nsl[i] = -1;

            stack.push(i);
        }
        
        // nearest smaller right side 
        int[] nsr = new int[n];
        Stack<Integer> stack1 = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(! stack1.isEmpty() && nums[stack1.peek()] >= nums[i]){
                stack1.pop();
            }
            if(! stack1.isEmpty())  nsr[i] = stack1.peek();
            else nsr[i] = n;

            stack1.push(i);
        }

        // finding width of every rectangle there 
        int[] width = new int[n];
        for(int i = 0; i< n; i++){
            width[i] = nsr[i] - nsl[i] - 1;   // only the in between okay 
        }

        // getting the area of all rectangles here 
        int[] area = new int[n];
        for(int i = 0; i< n; i++){
            area[i] = width[i] * nums[i];
        }

        int max = nums[0];
        for(int num : area){
            max = Math.max(max, num);
        }

        return max;
        
    }
}