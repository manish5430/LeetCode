class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for(int i =0; i< arr.length -1; i++){
            int min2 = ( arr[i+1] - arr[i] );
                    
                if(min2 < min){
                    min = min2;
                    ans.clear();
                    
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[i+1]);
                    ans.add(pair);
                }
                else if (min == min2){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[i+1]);
                    ans.add(pair);
                }
        }
        return ans;
    }
}