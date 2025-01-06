class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        left[0] = 0;  // simple 
        int count = boxes.charAt(0) - '0';  // this is add count at first index 
        for(int i = 1; i< n; i++){
            left[i] = left[i-1] + count;
            count += boxes.charAt(i) - '0';
        }

        right[n-1] = 0;
        count = boxes.charAt(n-1) - '0';   // starting coutn from end side 
        for(int i = n-2; i>= 0; i--){
            right[i] = right[i+1] + count;
            count += boxes.charAt(i) - '0';
        }

        for(int i = 0; i< n; i++){
            ans[i] = left[i] + right[i];
        }

        return ans;
    }
}