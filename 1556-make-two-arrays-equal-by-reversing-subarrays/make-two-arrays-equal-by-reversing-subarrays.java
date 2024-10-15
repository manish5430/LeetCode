class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr){
            list.add(num);
        }

        for(int num : target ){
            if(list.contains(num)){ 
                list.remove(Integer.valueOf(num));
            }
            else{
                return false;
            }
        }
        return list.isEmpty();        
    }
}