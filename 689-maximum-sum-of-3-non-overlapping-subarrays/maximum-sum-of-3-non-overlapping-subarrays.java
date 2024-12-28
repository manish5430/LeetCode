class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;

         int[] prefixSum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        // Step 2: Initialize arrays to store sums and indices
        int[][] sum1 = new int[4][n + 1];  // For 1, 2, or 3 subarrays
        int[][] index1 = new int[4][n + 1];  // To store the indices of the subarrays

        // Step 3: Calculate maximum sum of 1, 2, or 3 subarrays using dynamic programming
        for (int count = 1; count <= 3; count++) {
            for (int index2 = k * count; index2 <= n; index2++) {
                int currentSum = prefixSum[index2] - prefixSum[index2 - k] + 
                                 sum1[count - 1][index2 - k];

                if (currentSum > sum1[count][index2 - 1]) {
                    sum1[count][index2] = currentSum;
                    index1[count][index2] = index2 - k;
                } else {
                    sum1[count][index2] = sum1[count][index2 - 1];
                    index1[count][index2] = index1[count][index2 - 1];
                }
            }
        }

        // Step 4: Retrieve the indices of the 3 subarrays with the maximum sum
        int[] result = new int[3];
        int currentEnd = n;
        for (int subIndex = 3; subIndex >= 1; subIndex--) {
            result[subIndex - 1] = index1[subIndex][currentEnd];
            currentEnd = result[subIndex - 1];
        }

        return result;
    }
}