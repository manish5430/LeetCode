class Solution {
    public int numberOfSteps(int num) {

        if(num == 0) return 0;  // here it returns 0 because i need to just end it here 
        // and it only returns 0 at the end of stack when the recurive call starts backing up
        // they will keep +1 and returning other calls 

        if(num %2 == 0){
            return 1 + numberOfSteps(num /2);
        }
        return 1 + numberOfSteps(num -1);
    }
}