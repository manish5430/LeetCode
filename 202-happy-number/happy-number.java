class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while( n != 1){
            if( set.contains(n)){
                return false;
            }
            set.add(n);
        
            String nums = Integer.toString(n);
            char[] arr = nums.toCharArray();

            int sum = 0; 
            for(int i = 0; i< arr.length; i++){
                int digit = arr[i] - '0';
                sum += digit * digit;
            }
            n = sum;
        }
        return true;
    }
}