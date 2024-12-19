class Solution {
    public char findKthBit(int n, int k) {

        return recursion("0", n, k);
    }

    static char recursion(String s, int n, int k){
        if(n == 1){
            return s.charAt(k-1);
        }

        String inverted = s.replace('0', 'x').replace('1', '0').replace('x', '1');
        String s1 = new StringBuilder(inverted).reverse().toString();

        s = s + "1" + s1;

        return recursion(s, n-1, k);

        
    }
}