class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)  return s;

        int max = 0;
        int start = 0;
        int end = 0;

        for(int i = 0; i< s.length()-1; i++){
            
            int[] odd = expand(s, i, i);
            int[] even = expand(s, i, i+1);

            if(odd[1] - odd[0] -1   > max){
                max = odd[1] - odd[0] -1;
                start = odd[0] + 1;
                end = odd[1] -1;
            }

            if(even[1] - even[0] -1   > max){
                max = even[1] - even[0] -1;
                start = even[0] + 1;
                end = even[1] -1;
            }
        }       

        return s.substring(start, end +1);
    }

    static int[] expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return new int[]{left, right};

    }
}