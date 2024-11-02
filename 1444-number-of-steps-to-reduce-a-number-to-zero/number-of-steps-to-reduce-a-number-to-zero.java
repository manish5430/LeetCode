class Solution {
    public int numberOfSteps(int num) {
        return countSteps(num, 0);
            
    }

    static int countSteps(int num, int count){
        if(num == 0){
            return count;
        }

        if(num%2 == 0){
            return countSteps(num/2, count+1);
        }
        else{
            return countSteps(num-1, count+1);
        }
    }
}