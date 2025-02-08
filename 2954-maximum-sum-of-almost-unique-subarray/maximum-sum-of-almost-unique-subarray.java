class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        long sum = 0;
        for(int i = 0; i< k; i++){
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) +1);
            sum += nums.get(i);
        }
        if(map.size() >= m) ans = sum;

        int left = 0;
        int right = k;     // has to be of length k 

        while(right < nums.size()){
            map.put(nums.get(left), map.getOrDefault(nums.get(left), 0) -1);
            if(map.get(nums.get(left)) == 0) map.remove(nums.get(left));
            sum -= nums.get(left);
            left++;

            map.put(nums.get(right), map.getOrDefault(nums.get(right), 0) +1);
            sum += nums.get(right);
            right++;

            if(map.size() >= m) ans = Math.max(sum, ans);           

        }

        return ans;
    }
}