class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        int[] nums = new int[n];

        // code logic is fine its the efficiency 
        // for(int i = 0; i< nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j< shifts.length; j++){
        //         sum += shifts[j];
        //     }
        //     nums[i] = sum;
        // }

        // for(int i = 0; i< nums.length; i++){
        //     nums[i] = nums[i] % 26;
        // }

        nums[n-1] = shifts[n-1] % 26;   // just setting the base case for for loop

        for(int i = n-2; i >= 0; i--){
            nums[i] = (shifts[i] + nums[i+1]) % 26;
        }        
        
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i< s.length(); i++){
            char c = (char)('a' + ((s.charAt(i) -'a' + nums[i]) % 26));
            sb.setCharAt(i, c);   // index, character
        }

        return sb.toString();
    }
}