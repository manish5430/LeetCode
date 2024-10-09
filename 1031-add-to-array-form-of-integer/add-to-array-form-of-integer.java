class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i : num){
            nums.add(i);
        }

        int n = nums.size() -1;
        int carry = 0;

        for(int i = n; i >= 0; i--){
            int sum = nums.get(i) + k%10 + carry;
            nums.set(i, sum %10);
            carry = sum /10;
            k = k/10;

            if( k==0 && carry == 0){
                break;
            }
        }

        // if any k is still left to process
        while(k > 0){
            int val = k %10 + carry;
            nums.add(0, val %10);
            carry = val /10;
            k = k/10;
        }

        if( carry >0){
            nums.add(0, carry);
        }
        return nums;
    }
}