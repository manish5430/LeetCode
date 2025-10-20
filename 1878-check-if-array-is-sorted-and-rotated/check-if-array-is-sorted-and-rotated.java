class Solution {
    public boolean check(int[] nums) {

        int n = nums.length;
        int max = nums[0];
        int x = 0;

        for(int i = 0; i< n; i++){
            if(nums[i] >= max){
                max = nums[i];
                x = i;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = x +1; i< n; i++){
            list.add(nums[i]);
        }

        for(int i = 0; i<= x; i++){
            list.add(nums[i]);
        }
        
        for(int i = 0; i< n -1; i++){
            if(list.get(0) == list.get(n-1)) continue;
            if(list.get(i) > list.get(i+1)) {
                return false;
            }
        }

        return true;


        
    }
}