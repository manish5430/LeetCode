class Solution {
    public int[] sortByBits(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr){
            list.add(num);
        }

        Collections.sort(list, (a,b) -> {
            int n1 = Integer.bitCount(a);
            int n2 = Integer.bitCount(b);

            if(n1 == n2) {
                return a -b;
            }
            return n1 - n2;
        });

        for(int i = 0; i< arr.length; i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}