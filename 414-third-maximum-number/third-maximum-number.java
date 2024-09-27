class Solution {
    public int thirdMax(int[] nums) {
        long num1 = Long.MIN_VALUE;
        long num2 = Long.MIN_VALUE;
        long num3 = Long.MIN_VALUE;

        for(int num : nums){
            if( num > num1){
                num3 = num2;
                num2 = num1;
                num1 = num;
            }
            else if( num > num2 && num < num1){
                num3 = num2;
                num2 = num;
            }
            else if( num > num3 && num < num2){
                num3 = num;
            }
        }

        if(num3 != Long.MIN_VALUE){
            return (int)num3;
        }
        else{
            return (int)num1;
        }
    }
}