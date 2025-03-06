class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        int x = 4;

        while(n > 1){
            ans += x;
            x += 4;
            n--;
        }
        return ans;
    }
}