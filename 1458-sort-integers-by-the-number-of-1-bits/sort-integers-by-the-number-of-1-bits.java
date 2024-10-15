class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = new Integer[arr.length];
        for(int i=0; i< arr.length; i++){
            boxedArr[i] = arr[i];
        }

        Arrays.sort(boxedArr, (a, b) -> {
            int countA = countbits(a);
            int countB = countbits(b);
            
            if( countA == countB){
                return a - b;
            }
            return countA - countB;
        });

        for(int i =0; i< boxedArr.length; i++){
            arr[i] = boxedArr[i];
        }
        return arr;
    }

    static int countbits(int num){
        int count = 0;
        while( num != 0){
            count += (num & 1);
            num >>= 1;
        }
        return count;
    }
}