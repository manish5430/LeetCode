class Solution {
    public long minEnd(int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        long result = x;
        long last = n-1;

        for(int i = 0; i< 32; i++){
            if((x & (1 << i)) == 0){
                list.add(i);
            }
        }

        for(int i= 32; i< 64; i++){
            list.add(i);
        }
        for(int i = 0; last > 0; i++, last >>=1){
            if((last & 1L) == 1){
              result += (1L << list.get(i));
            }
        }
        return result;
    }
}