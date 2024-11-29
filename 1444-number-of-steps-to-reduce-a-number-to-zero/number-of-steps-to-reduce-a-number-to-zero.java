class Solution {
    public int numberOfSteps(int num) {
        return steps(num, 0);
        
    }
    static int steps(int num, int count){
        if(num == 0) return count;

        if(num%2 == 0){
            return steps(num/2, count+1);
        }else{
            return steps(num-1, count+1);
        }
    }
}