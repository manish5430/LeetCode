class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for(int num : arr1){
            max = Math.max(num, max);
        }

        int[] count = new int[max +1];
        for(int num : arr1){
            count[num]++;
        }
        
        int[] ans = new int[arr1.length];
        int index = 0; 
        for(int num : arr2){
            while(count[num] > 0){
                ans[index] = num;
                count[num]--;
                index++;
            }
        }

        for(int i = 0; i< count.length; i++){
            while(count[i]> 0){
                ans[index] = i;
                count[i]--;
                index++;
            }
        }
        return ans;
    
    }
}