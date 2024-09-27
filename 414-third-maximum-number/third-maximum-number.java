class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Step 1: Collect unique numbers
        for (int num : nums) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        // Step 2: Check if we have at least 3 unique numbers
        if (uniqueList.size() < 3) {
            // Find the maximum manually
            int max = uniqueList.get(0);
            for (int i = 1; i < uniqueList.size(); i++) {
                if (uniqueList.get(i) > max) {
                    max = uniqueList.get(i);
                }
            }
            return max; // Return the maximum
        }

        // Step 3: Sort the list and return the third maximum
        uniqueList.sort(null); // Sort the list
        return uniqueList.get(uniqueList.size() - 3); // Return the third maximum
    }
}