class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        } while( slow != fast);
        
        return slow == 1;
    }

    static int getNext(int n){
        int sum = 0;
        while( n > 0){
            int digit  = n % 10;
            sum += digit * digit;
            n = n /10;
        }
        return sum;
    }
             
}