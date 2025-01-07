class Solution {
    public int reverse(int x) {

        return recursion(x, 0);
        
    }

    static int recursion(int num, int result){
        if(num == 0) return result;

        if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && num %10 >7)){
            return 0;
        }
        if(result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && num %10 < -8)){
            return 0;
        }

        result = result *10 + num %10;
        return recursion(num/10, result);
    }
}