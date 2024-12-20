class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;

        long n1 = n;

        if(n1 < 0){
            n1 = -n1;
            x = 1 /x;
        }
        // for even just x *x then half the power to make it work otherwise 
// deep recursion is the primary reason you're getting a stack overflow 

        if(n1 %2 == 0) return myPow(x *x, (int)(n1 /2));
        return x * myPow(x, (int)(n1 -1));  // other than that this is enough
        
    }
}