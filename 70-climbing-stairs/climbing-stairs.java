class Solution {
    public int climbStairs(int n) {
        if( n <= 3) return n;

        int x1 = 2;
        int x2 = 3;
        int num =0;

        for(int i = 3; i< n; i++){
            num = x1 + x2;
            x1 = x2;
            x2 = num;
        }
        return num;
    }
}