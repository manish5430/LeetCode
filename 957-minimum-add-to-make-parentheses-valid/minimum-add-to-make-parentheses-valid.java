class Solution {
    public int minAddToMakeValid(String s) {
        int count1 = 0;
        int count2 = 0;

        // Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(')  count1++;
            else{
                if(count1 > 0) count1--;
                else count2++;
            }            
        }

        return count1 + count2;     
    }
}