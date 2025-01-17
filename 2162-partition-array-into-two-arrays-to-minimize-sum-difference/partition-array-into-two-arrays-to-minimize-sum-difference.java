class Solution {
    public int minimumDifference(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int target = total / 2;

        int n = nums.length / 2;

        List<List<Integer>> sums1 = new ArrayList<>();
        List<List<Integer>> sums2 = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            sums1.add(new ArrayList<>());
            sums2.add(new ArrayList<>());
        }

        int subsets = (1 << n);
        for (int mask = 0; mask < subsets; mask++) {
            int count = 0, sum1 = 0, sum2 = 0;

            for (int bit = 0; bit < n; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    sum1 += nums[bit];
                    sum2 += nums[n + bit];
                    count++;
                }
            }
            sums1.get(count).add(sum1);
            sums2.get(count).add(sum2);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(sums2.get(i));
        }

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            int j = n - i;
            for (int s1 : sums1.get(i)) {
                int req = target - s1;
                List<Integer> s2List = sums2.get(j);
                int closest = s2List.get(s2List.size() - 1);

                int index = Collections.binarySearch(s2List, req);
                if (index < 0) index = -index - 1;
                if (index < s2List.size()) closest = s2List.get(index);

                minDiff = Math.min(minDiff, Math.abs(total - 2 * (s1 + closest)));
            }
        }

        return minDiff;
    }
}