class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] nums = new int[s.length()];
        for(int[] shift : shifts){
            if(shift[2] == 1){         // forward shift 
                nums[shift[0]]++;
                if(shift[1]+1 < s.length()){
                    nums[shift[1] +1]--;
                }
            }
            if(shift[2] == 0){
                nums[shift[0]]--;
                if(shift[1]+1 < s.length()){
                    nums[shift[1] +1]++;
                }                
            }
        }

        StringBuilder sb = new StringBuilder(s);
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum = (sum + nums[i]) % 26; 
            if(sum < 0)  sum += 26; 

            char c = (char)('a' + ((s.charAt(i) - 'a' + sum) % 26));
            
            sb.setCharAt(i, c);
        }
        
        return sb.toString();
    }
}