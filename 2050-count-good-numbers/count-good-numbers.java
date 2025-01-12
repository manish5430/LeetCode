class Solution {
    static long Mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd  = n/2;

        long num1 = pow(5, even) % Mod;
        long num2 = pow(4, odd) % Mod;

        return (int)((num1 * num2) % Mod);
    }

    static long pow(int x, long n){
        if(n == 0) return 1;
        long temp = pow(x, n/2) % Mod;

        if(n %2 == 0){
            return (temp * temp) % Mod;
        }else{
            return (x * temp * temp) % Mod;
        }
    }
}