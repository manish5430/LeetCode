class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for(int num : nums){
            int sum = noSum(num);
            if(map.containsKey(sum)){
                int num1 = map.get(sum);   // previous number 
                max = Math.max(max, num1 + num);   // previous num + new num;
                map.put(sum, Math.max(num1, num));    // previous / new num  which is max 
            }else{
                map.put(sum, num);
            }
        }
        return max;        
    }

    static int noSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num/10;            
        }
        return sum;
    }
}