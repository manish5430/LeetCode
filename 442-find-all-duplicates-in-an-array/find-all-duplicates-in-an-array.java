class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i= 0; i< nums.length; i++){  
        // find correct index of all elements
            int index = Math.abs(nums[i]) -1;

        // make all elements negative at first one by one 
        // then check if at that correct index the element is negative 

        // iterate over nums and make each element negative now if we iterate over nums if we find any negative element means we have iterated over this before means its duplicate so just add it to list 
            if(nums[index] > 0){
                nums[index] = - nums[index];
            }else{
                list.add(Math.abs(nums[i]));
            }
        }
        return list;
    }
}