class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //int[] nums = arr.clone(); 
        int[] nums = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            nums[i] = arr[i];            
        }
        Arrays.sort(nums);
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int rank = 1;
        for(int num : nums){
            if ( ! hashMap.containsKey(num)){
                hashMap.put(num, rank);
                rank++;
            }
        }

        int[] result = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            result[i] = hashMap.get(arr[i]);
        }
        return result;
    }
}