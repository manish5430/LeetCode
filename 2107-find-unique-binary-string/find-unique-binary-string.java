class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        ArrayList<String> list = new ArrayList<>();
        recursion("", n, list);

        for(String s1 : nums){
            if(list.contains(s1)){
                list.remove(s1);
            }
        }
        return list.get(0);        
    }

    static void recursion(String s, int n, ArrayList<String> list){
        if(n == 0){
            list.add(s);
            return;
        }

        recursion(s + "0", n-1, list);
        recursion(s + "1", n-1, list);
    }
}