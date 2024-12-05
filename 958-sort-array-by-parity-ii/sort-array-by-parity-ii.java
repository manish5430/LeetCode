class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int a = 0; a<nums.length; a++){
            list.add(null);
        }

        int i =0; 
        for(int n : nums){
            if(n%2 == 0){
                list.set(i, n);
                i += 2;
            }
        }
        int k = 0;
        for(int n: nums){
            if(n%2 != 0){
                list.set(k*2 +1, n);
                k++;
            }
        }       


        int[] asn = new int[list.size()];
        for(int j= 0; j< asn.length; j++){
            asn[j] = list.get(j);
        }

        return asn;
    }
}