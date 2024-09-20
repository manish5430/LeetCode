class Solution {
    public int splitArray(int[] arr, int k) {
        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while(start < end){

            int mid = start +(end - start)/2;

            int sum = 0;
            int pieces = 1;

            for(int num : arr){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
