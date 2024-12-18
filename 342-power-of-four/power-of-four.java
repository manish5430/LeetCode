class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;

        while(n % 4 == 0){
            n = n/4;   // n will keep reducing if this condition hold till the end
        }            // if condition holds till the end then in end n will be 1 

        return n == 1; 
    }
}