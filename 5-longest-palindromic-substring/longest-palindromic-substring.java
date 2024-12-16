class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)  return s;

        int max = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i< s.length()-1; i++){
            int left = i;
            int right = i;
            
            while(left >= 0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }

            int length = right - left -1; 
            if(length > max){
                max = length;
                start = left + 1;
                end = right -1;
            }
        }

        for(int i = 0; i< s.length()-1; i++){
            int left = i;
            int right = i +1 ;   // for even length string 

            while( left >= 0  && right< s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    left--;
                    right++;
                }
                else{
                    break;
                }
            }

            int length = right - left -1;
            if(length > max){
                max = length;
                start = left +1; 
                end = right -1;
            }
        }

        return s.substring(start, end +1);
    }
}