class Solution {
    public int countLargestGroup(int n) {
        int[] sums = new int[37];
        for(int i = 1; i<= n; i++){
            sums[digitSum(i)]++;
        }

        int maxi = 0; int count = 0;
        for(int i : sums){
            if(i > maxi){
                maxi = i;
                count = 1;
            }
            else if(i == maxi){
                count++;                
            }
        }
        return count;
        
    }

    static int digitSum(int n){
        int sum = 0;

        while(n > 0){
            sum += n % 10;
            n = n/ 10;
        }
        return sum;
    }
}