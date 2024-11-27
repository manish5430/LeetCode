class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] arr = s.toCharArray();
        int ans = 0;
        int num = 0;
    
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    num = Math.abs(j-i);                    
                }
                ans = Math.max(ans, num);
            }
        }
        return ans-1;
    }
}