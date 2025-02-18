class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        boolean[] used = new boolean[10];
        StringBuilder sb = new StringBuilder();

        backtrack(pattern, 0, new int[n+1], used, sb);
        return sb.toString();
    }

    static boolean backtrack(String pattern, int index, int[] num, boolean[] used,
                                StringBuilder sb){
        if(index > pattern.length()){
            for(int i = 0; i< num.length; i++){
                sb.append(num[i]);
            }
            return true;        
        }

        for(int digit = 1; digit<= 9; digit++){
            if(! used[digit] && (index == 0 || 
                        isValid(digit, num[index-1], pattern.charAt(index -1)))){
                used[digit] = true;
                num[index] = digit;
                if(backtrack(pattern, index+1, num, used, sb)){
                    return true;
                }
                num[index] = 0;
                used[digit] = false;
            }
        }
        return false;
    }

    static boolean isValid(int curr, int prev, char ch){
        return (ch == 'I' && prev < curr) || (ch == 'D' && prev > curr);
    }
}