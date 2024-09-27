class Solution {
    public int thirdMax(int[] nums) {
        // Create a TreeSet to store unique numbers in sorted order
        TreeSet<Integer> set = new TreeSet<>();

        // Step 1: Add unique elements to the TreeSet
        for (int num : nums) {
            set.add(num);
            // Maintain only the top three maximums in the TreeSet
            if (set.size() > 3) {
                set.pollFirst(); // Remove the smallest element to keep only the largest three
            }
        }

        // Step 2: Check if there are three unique numbers
        if (set.size() < 3) {
            return set.last(); // Return the largest if there are fewer than three unique numbers
        } else {
            return set.first(); // The first element is the third maximum
        }
    }
}