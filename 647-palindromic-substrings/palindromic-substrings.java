class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i = 0; i< s.length(); i++){
            ans += substring(s, i, i);
            ans += substring(s, i, i+1);
        }
        return ans;        
    }

    static int substring(String s, int left, int right){
        int count = 0;
        while(left >= 0 && right< s.length()){
            if(s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }else{
                break;
            }
        }
        return count;
    }
}