class Solution {
    public int maximalRectangle(char[][] matrix) {

        int[] height = new int[matrix[0].length];
        int result = 0;

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                int val = matrix[i][j] - '0';
                if(val == 0){
                    height[j] = 0;                    
                }
                else{
                    height[j] += val;
                }
            }
            int maxArea = largestArea(height);
            result = Math.max(maxArea, result);
        }
        return result;
        
    }

    static int largestArea(int[] nums){
        int n = nums.length;

        int[] nsl = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< n; i++){

            while(! stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty())  nsl[i] = stack.peek();
            else nsl[i] = -1;

            stack.push(i);
        }

        int[] nsr = new int[n];
        Stack<Integer> stack1 = new Stack<>();
        for(int i = n-1; i>= 0; i--){

            while(! stack1.isEmpty() && nums[stack1.peek()] >= nums[i]){
                stack1.pop();
            }
            if(!stack1.isEmpty())  nsr[i] = stack1.peek();
            else nsr[i] = n;    // because from end side 

            stack1.push(i);
        }

        int max = 0;        // here we didnt store the width area anywhere
        for(int i = 0; i< n; i++){
            int width = nsr[i] - nsl[i] - 1;
            int area = width * nums[i];
            max = Math.max(max, area);
        }

        return max;

    }
}