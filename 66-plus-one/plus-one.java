class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = findsum(digits, 1);
        return result;
    }

    static int[] findsum(int[] digits, int k){

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i : digits){
            nums.add(i);
        }

        int n = nums.size() -1; 
        int carry = 0;

        for(int i=n ; i>= 0; i--){
            int sum = nums.get(i) + k %10 + carry;
            nums.set(i, sum %10);
            carry = sum /10;
            k = k/10;
            

            if( k == 0 && carry == 0){
                break;
            }
        }    
        if(carry > 0){
                nums.add(0, carry);
        }
        
        int[] ans = new int[nums.size()];
        for(int i =0; i<ans.length; i++){
            ans[i] = nums.get(i);
        }
        return ans;
        
    }
}