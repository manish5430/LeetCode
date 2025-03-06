class Solution {
    public long coloredCells(int n) {
        long m = n;
        return 1 + (4 * m * (m-1)/2);
    }
}