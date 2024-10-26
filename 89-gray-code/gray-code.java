class Solution {
    public List<Integer> grayCode(int n) {
        if( n ==1){
            List<Integer> arr = new ArrayList<>();
            arr.add(0);
            arr.add(1);
            return arr;
        }

        List<Integer> list = grayCode(n-1);
        List<Integer> result = new ArrayList<>();
        for(int i= 0; i< list.size(); i++){
            result.add(list.get(i));
        }

        int addBit = 1 << (n-1);
        for(int i = list.size()-1; i>= 0; i--){
            result.add(addBit + list.get(i));
        }
        return result;
    }
}