class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<= n; i++){
            list.add(i);    // starting from 1 at 0th index
        }
        
        int start = 0;
        return recursion(list, n, k, 0);

    }

    static int recursion(ArrayList<Integer> list, int n, int k, int start){
        if(n == 1){
            return list.get(0);
        }

        start = (start + k-1) % list.size();
        list.remove(start);

        return recursion(list, n-1, k, start);
    }
}