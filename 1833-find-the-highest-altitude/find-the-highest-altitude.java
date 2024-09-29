class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0;
        int alt = 0;

        for(int num : gain){
            alt += num;  
            result = Math.max(result, alt);
        }
        return result;
    }
}