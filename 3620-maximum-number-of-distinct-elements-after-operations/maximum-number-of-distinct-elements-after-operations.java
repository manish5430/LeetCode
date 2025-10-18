class Solution {
    public int maxDistinctElements(int[] nums, int k) {

        Arrays.sort(nums);
        nums[0] = nums[0] - k;

        for(int i = 1; i< nums.length; i++){
            
            int low = nums[i] -k;
            int high = nums[i] +k;

            if(nums[i-1] < nums[i] + k){
                nums[i] = Math.max(low, nums[i-1] +1);
            }
            // see what happens over here is that the current nums[i] we need to keep inside the low adn high range what if nums[i-1] +1  still lower than nums[i]-k we cannot reduce the number more than -k no way 

            // so its either nums[i]-k thats low  or nums[i-1] + 1   which one is max
           
            // aur nums[i-1] + 1 ki upper limit bhi nhi cross honi chahiye or if its goes lower it cannot go lower than low value 

            else{
                nums[i] = nums[i-1];
            }

            
        }

        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        
        return set.size();

    }
}