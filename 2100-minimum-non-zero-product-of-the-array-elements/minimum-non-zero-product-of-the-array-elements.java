class Solution {
    static int Mod = 1_000_000_007;
    public int minNonZeroProduct(int p) {
        if(p == 1) return 1;

        long max = (long)(Math.pow(2, p)) -1; 
        long max2 = max - 1;
        long count = max2 / 2;
        long sum = pow(max2, count);

        return (int)(sum * (max % Mod) % Mod);

    }

    static long pow(long base, long n){
        if(n == 0) return 1;
        if(n == 1) return (base % Mod);

        long base1 = ((base % Mod) * (base % Mod)) % Mod;

        if(n % 2 == 1){
            return ((pow(base1, n/2) % Mod) * (base % Mod)) % Mod;
        }

        return pow(base1, n/2) % Mod;
    }
}