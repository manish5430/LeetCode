class Solution {
    public int specialArray(int[] nums) {
 Arrays.sort(nums);

        // Check for every possible x from 0 to the length of the array
        for (int x = 0; x <= nums.length; x++) {
            int count = 0;
            for (int num : nums) {
                if (num >= x) {
                    count++;
                }
            }
            if (count == x) {
                return count; // Found a special number
            }
        }
        return -1; // Return false if no special number is found
    }
}