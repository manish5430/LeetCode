class Solution {
    public int mySqrt(int n) {
       if( n == 0) {
         return 0;
       }

       int s = 1; 
       int e = n;

       // we need to use mid = n / mid to avoid overflow for bigger values 
  
       while( s <= e){
        int m = s +(e-s)/2;
        if( m  == n/m) { return m;}
        if( m  > n/m) {  e = m-1;}
        if( m  < n/m) { s = m+1;}
       }
       return e;
    }
}