class Solution {
    static long Mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = (n +1)/2;
        long odd = n /2;

        long num1 = pow(5, even) % Mod;   // 0. 2, 4, 6, 8
        long num2 = pow(4, odd) % Mod;   // for prime 2, 3, 5, 7

        return (int)((num1 * num2)% Mod);    // for permutations multiply    
    }

    static long pow(int x, long n){
        if(n == 0) return 1;

        long temp = pow(x, n/2) % Mod;

        if(n %2 == 0){
            return (temp * temp) % Mod;
        }
        else{
            return (x * temp* temp) % Mod;
        }
    }
}