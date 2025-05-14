class Solution {
    static final int MOD = 1_000_000_007; // Modulo value for large numbers

    // Helper function to multiply two 26x26 matrices
    private long[][] multiplyMatrices(long[][] A, long[][] B) {
        // Create a new 26x26 matrix to store the result
        long[][] result = new long[26][26];
        // For each cell (i, j) in the result matrix
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                // Compute result[i][j] = sum(A[i][k] * B[k][j]) for all k
                for (int k = 0; k < 26; k++) {
                    result[i][j] = (result[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return result;
    }

    // Helper function to compute matrix^power using fast exponentiation
    private long[][] matrixPower(long[][] matrix, int power) {
        // Create a 26x26 identity matrix (1 on diagonal, 0 elsewhere)
        long[][] result = new long[26][26];
        for (int i = 0; i < 26; i++) {
            result[i][i] = 1; // Identity matrix has 1s on diagonal
        }

        // While power > 0, compute matrix^power
        while (power > 0) {
            // If power is odd, multiply result by matrix
            if (power % 2 == 1) {
                result = multiplyMatrices(result, matrix);
            }
            // Square the matrix (matrix = matrix * matrix)
            matrix = multiplyMatrices(matrix, matrix);
            // Divide power by 2
            power /= 2;
        }
        return result;
    }

    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        // Step 1: Count frequency of each letter in s
        long[] freq = new long[26]; // Array to store count of a, b, ..., z
        for (char c : s.toCharArray()) {
            freq[c - 'a']++; // Increment count for letter c (e.g., 'a' -> 0)
        }

        // Step 2: Build the transition matrix
        long[][] matrix = new long[26][26]; // 26x26 matrix for transformations
        for (int i = 0; i < 26; i++) { // For each letter i (0 = a, 1 = b, ...)
            int num = nums.get(i); // Number of characters letter i transforms into
            // Letter i transforms into the next num characters (with wrap-around)
            for (int j = 1; j <= num; j++) {
                int nextChar = (i + j) % 26; // Wrap around using modulo 26
                matrix[i][nextChar] = 1; // Letter i contributes 1 to nextChar
            }
        }

        // Step 3: Compute matrix^t using fast exponentiation
        long[][] poweredMatrix = matrixPower(matrix, t);

        // Step 4: Multiply initial freq by poweredMatrix to get final frequencies
        long[] finalFreq = new long[26]; // Final frequency of each letter
        for (int j = 0; j < 26; j++) { // For each final letter j
            for (int i = 0; i < 26; i++) { // For each initial letter i
                // finalFreq[j] += freq[i] * poweredMatrix[i][j]
                finalFreq[j] = (finalFreq[j] + freq[i] * poweredMatrix[i][j]) % MOD;
            }
        }

        long sum = 0;
        for (long count : finalFreq) {
            sum = (sum + count) % MOD;
        }

        return (int) sum;
    }
}