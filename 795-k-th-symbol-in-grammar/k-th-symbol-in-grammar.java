class Solution {
    public int kthGrammar(int n, int k) {
        return findSymbol(n, k);
    }

    static int findSymbol(int n, int k) {
        if (n == 1) return 0;  // Base case: Row 1 is "0"

        int mid = 1 << (n - 2);  // Size of the first half of the previous row
        
        if (k <= mid) {
            return findSymbol(n - 1, k);  // Same as the previous row's k-th symbol
        } else {
            int result = findSymbol(n - 1, k - mid);  // Inverse of the previous row's (k - mid)-th symbol
            return result == 0 ? 1 : 0;  // Invert the result
        }
    }
}
