class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = left; i<= right; i++){
            int num = i; 
        
            boolean isDivide = true;

            while( num > 0){
                int digit = num % 10;
                if(digit == 0 || i % digit != 0){
                    isDivide = false;
                    break;  // exit the loop if not selfdividing 
                }
                else{
                    num = num /10;
                }
            }

            if(isDivide)  list.add(i);
        }
        return list;
    }
}