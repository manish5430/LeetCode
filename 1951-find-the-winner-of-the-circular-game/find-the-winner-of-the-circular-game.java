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

    // kth value is counted from 0th index 0 1 2 3 k but we haeve ot remove kth number as 1st indexed so start = 0 + k -1 
        start = (start + k-1) % list.size();
        list.remove(start);  // we removed the element at start index now so new num will be at strat index now and same process as start + k -1 but dont forget the modulo we have to roll back too

        return recursion(list, n-1, k, start);
    }
}