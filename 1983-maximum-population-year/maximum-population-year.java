class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];

        for(int[] log : logs){
            int by = log[0];
            int dy = log[1];

            arr[by - 1950]++;
            arr[dy - 1950]--;
        }

        int max = arr[0];
        int maxyear = 1950;

        for(int i=1; i< 101; i++){
            arr[i] += arr[i-1];
            if( arr[i] > max){
                max = arr[i];
                maxyear = i+ 1950;
            }
        }
        return maxyear;
    }
}