class Solution {
    public long pickGifts(int[] gifts, int k) {
        int x = 0;

        boolean isdone = false;

        while(x < k){
            int max = Integer.MIN_VALUE;
            for(int num : gifts){
                max = Math.max(max, num);
            }
            
            for(int i = 0; i< gifts.length; i++){
                if(gifts[i] == max){
                    gifts[i] = (int)Math.sqrt(max);
                    isdone = true;
                    break;
                }
            }
            x++;
        }
        long sum = 0;
        for(int num : gifts){
            sum += num;            
        }

        return sum;
    }
}