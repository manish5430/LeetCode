class Solution {
    public int maximumSwap(int num) {
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);

        int max = num; 

        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                // we just swap it anyway here once 
                swap(sb, i, j);

                int num2 = Integer.valueOf(sb.toString());
                // if after swappping we find the number greater tham max then return 
             //max but if number is not greater than max then revertthe swapping that we did 
                if (num2 > max) {
                    max = num2; 
                }
                swap(sb, i, j);

            }
        }
        
        return max;
    }

    // Method to swap characters in the StringBuilder
    private void swap(StringBuilder sb, int i, int j) {
        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);
    }
}
