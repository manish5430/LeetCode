class Solution {
    public int maxScoreSightseeingPair(int[] values) {

        int max1 = values[0] + 0;
        int max2 = Integer.MIN_VALUE;
        
        for(int j = 1; j< values.length; j++){

            max2 = Math.max(max2, max1 + values[j] - j);

            max1 = Math.max(max1, values[j] + j);
            // + is beacuse max1 shoudl + i so + j 
            // so far max1 value 
            // and as loop will repeat again max1 value upated
            //  max2 will use updated max1 to add and find max value

        }
        return max2;        
    }
}