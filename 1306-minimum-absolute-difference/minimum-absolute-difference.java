class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        int min = arr[1] - arr[0];        

        for(int i = 1; i< arr.length; i++){
            min = Math.min(arr[i] - arr[i-1], min);            
        }

        for(int i = 1; i< arr.length; i++){
            if(arr[i] - arr[i-1] == min){
                List<Integer> sublist = List.of(arr[i-1], arr[i]);
                list.add(sublist);
            }
        }
        return list;
    }
}