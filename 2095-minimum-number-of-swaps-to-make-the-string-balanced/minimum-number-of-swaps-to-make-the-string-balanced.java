class Solution {
    public int minSwaps(String s) {
        int count1 = 0;
        int count2 = 0;

        for(char c : s.toCharArray()){
            if(c == '[') count1++;
            else{
                if(count1 > 0) count1--;
                else count2++;
            }
        }

        return (count1 + 1)/2;  
    }
}