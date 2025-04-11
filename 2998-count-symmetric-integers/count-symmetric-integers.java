class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for(int i = low; i<= high; i++){
            int digit = String.valueOf(i).length();
            int sum1 = 0;
            int sum2 = 0;
            if(digit %2 != 0) continue;
            else{
                for(int j = 0; j< digit/2; j++){
                    sum1 += String.valueOf(i).charAt(j) - '0';                    
                }
                for(int k = digit/2; k< digit; k++){
                    sum2 += String.valueOf(i).charAt(k) - '0';
                }
            }

            if(sum1 == sum2) count++;
        }

        return count;
    }
}