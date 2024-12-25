class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);

        int max = num; // Start with the original number
        boolean swapped = false; // Track if a swap has been made

        // Try swapping each pair of digits to maximize the number
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                // Swap i and j
                swap(sb, i, j);
                
                // Convert the string to a number and check if it's greater than max
                int num2 = Integer.valueOf(sb.toString());
                if (num2 > max) {
                    max = num2; // Update the max value if we found a larger number
                    swapped = true; // Mark that a swap has been made
                }
                
                // Swap back to try the next pair
                swap(sb, i, j);
            }
        }
        
        return max;
    }

    // Method to swap characters in the StringBuilder
    private void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
}
