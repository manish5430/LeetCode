class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int k) {
        ArrayList<Boolean> list = new ArrayList<>();

        for(int num : candies){
            int m = maxval(candies);
            if( num + k  >= m){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

    static int maxval(int[] arr){
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}