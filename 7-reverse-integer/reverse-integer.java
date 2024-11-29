class Solution {
    public int reverse(int x) {
        return revNum(x, 0);
        
    }
    static int revNum(int n, int result){

    if(n == 0) return result;

    if((result > Integer.MAX_VALUE /10) || (result == Integer.MAX_VALUE /10) && n%10 > 7)
        return 0; 
    if((result < Integer.MIN_VALUE /10) || (result == Integer.MIN_VALUE /10) && n%10 < -8)
        return 0; 
          
    result = result*10 + n%10;      

    return revNum(n/10,  result);
    
    }
}