class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freqArr = new int[1001];
        int[] ans = new int[arr1.length];

        for(int num : arr1){
            freqArr[num]++;
        }

        int index = 0;
        for(int num : arr2){
            while(freqArr[num] > 0){
                ans[index++] = num;
                freqArr[num]--;
            }
        }

        for(int num = 0; num < freqArr.length; num++){
            while(freqArr[num] > 0){
                ans[index++] = num;
                freqArr[num]--;
            }
        }

        return ans;       
        
    }
}