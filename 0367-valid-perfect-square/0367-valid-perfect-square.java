class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 0;

        if(num == 0 || num == 1){
            return true;
        }
        while(i <= num/2){

            if(i *i < num){
                i++;
                continue;
            }
            else if(i *i == num){
                return true;
            }
            else{
                break;
            }
        }
        return false;
    }
}