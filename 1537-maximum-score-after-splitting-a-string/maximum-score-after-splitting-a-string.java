class Solution {
    public int maxScore(String s) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i< s.length()-1; i++){
            String s1 = s.substring(0, i+1);
            String s2 = s.substring(i+1, s.length());

            int count1 = 0;
            int count2 = 0;
            
            for(char c : s1.toCharArray()){
                if(c == '0'){
                    count1++;
                }
            }
            for(char c : s2.toCharArray()){
                if(c == '1'){
                    count2++;
                }
            }

            if((count1 + count2) > max){
                max = count1 + count2;
            }
        }

        return max;
    }
}