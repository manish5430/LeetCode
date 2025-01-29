class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        recursion(s, 0, result, list);
        return result;
    }

    static void recursion(String s, int i, List<List<String>> result, ArrayList<String> list){
        int n = s.length();
        if(i == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int j = i; j< n; j++){
            if(isPalindrome(s, i, j)){
                list.add(s.substring(i, j+1));

                recursion(s, j+1, result, list);
                list.remove(list.size() -1);
            }
        }
    }

    static boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}