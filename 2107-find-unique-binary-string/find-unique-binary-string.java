class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        HashSet<String> set = new HashSet<>();
        recursion("", n, set);

        for(String s1 : nums){
            if(set.contains(s1)){
                set.remove(s1);
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        return list.get(0);            
    }

    static void recursion(String s, int n, HashSet<String> set){
        if(n == 0){
            set.add(s);
            return;
        }

        recursion(s + "0", n-1, set);
        recursion(s + "1", n-1, set);
    }
}