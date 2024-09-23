class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for(int num : aliceSizes)  aliceSum += num;
        for(int num : bobSizes)  bobSum += num;
        
        for(int i=0; i<aliceSizes.length; i++){
            for(int j=0; j<bobSizes.length; j++){
                if(aliceSum - aliceSizes[i] + bobSizes[j] == bobSum - bobSizes[j] + aliceSizes[i]){
                    return new int[] { aliceSizes[i], bobSizes[j]};
                }
            }
        }
        return new int[0];
    }
}