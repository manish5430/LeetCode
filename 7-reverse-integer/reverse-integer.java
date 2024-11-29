class Solution {
    public int reverse(int x) {
        result = 0;
        revNum(x);
        //System.out.println(result);
        return result;
        
    }
    static int result = 0;
    static void revNum(int n){

    if(n == 0) return;

    if((result > Integer.MAX_VALUE /10) || (result == Integer.MAX_VALUE /10) && n%10 > 7){
        result = 0; 
        return; 
    }
    if((result < Integer.MIN_VALUE /10) || (result == Integer.MIN_VALUE /10) && n%10 < -8){
        result = 0; 
        return;
    }
          
    result = result*10 + n%10;      

    revNum(n/10);

    }
}