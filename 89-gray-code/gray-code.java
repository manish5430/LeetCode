class Solution {
    public List<Integer> grayCode(int n) {
        ArrayList<String> ans = recursion(n);
        ArrayList<Integer> nums = new ArrayList<>();

        for(String binary : ans){
            nums.add(Integer.parseInt(binary, 2));
        }
        return nums;
    }

    static ArrayList<String> recursion(int n){

        if(n == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add("0");
            list.add("1");
            return list;
        }

        ArrayList<String> result = recursion(n-1);
        ArrayList<String> list1 = new ArrayList<>();

        for(int i = 0; i< result.size(); i++){
            list1.add("0" + result.get(i));
        }
        for(int i = result.size()-1; i>= 0; i--){
            list1.add("1" + result.get(i));
        }
        return list1;

    }
}