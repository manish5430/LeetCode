class Solution {
    public int numOfSubarrays(int[] arr) {
        int oddCount = 0;
        int evenCount = 1;
        int prefixSum = 0;
        int count = 0;
        int Mod = 1000000007;

        for(int num : arr){
            prefixSum += num;

            if(prefixSum %2 != 0){
                count += evenCount;
                oddCount++;
            }else{
                count += oddCount;
                evenCount++;
            }
            count = count % Mod;
        }    
          
        return count;        
    }
}