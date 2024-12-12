class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] freqArr = new int[10001];
        int[] ans = new int[2];

        for(int num : nums){
            set.add(num);
            freqArr[num]++;
        }       

        for(int num : nums){
            if(freqArr[num] == 2){
                ans[0] = num;
            }
        }       

        for(int i = 1; i<= nums.length; i++){
            if(!set.contains(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}