class Solution {
    public void reverseString(char[] s) {
        char[] s1 = recursion(s, 0, s.length-1);
        System.out.println(s1);
        
    }

    static char[] recursion(char[] s, int start, int end){
        if(start > end) return s;

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

// start++ and end-- are post-increment and post-decrement operators.
       // recursion(s, start++, end--);    is wrong
        return recursion(s, start+1, end-1);
    
    }
}