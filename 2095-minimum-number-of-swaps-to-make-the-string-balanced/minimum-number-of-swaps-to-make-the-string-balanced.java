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

        if(count2 %2 == 0) return count2/2;
        return (count2 +1) /2;   

        // see in the end it was all about the even odd count1 2
        // ]]] [[[   this  is count2 = 3 and one swap fix 2 brackets= 4 signs 
        //  for odd ones   count2 +1  /2
    }
}