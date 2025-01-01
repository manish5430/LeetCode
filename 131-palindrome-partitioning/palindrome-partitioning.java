class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();

        recursion(s, 0, result, list);
        return result;
    }

    static void recursion(String s, int index, List<List<String>> result, ArrayList<String> list){
        if(index == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i< s.length(); i++){
            if(isPalindrome(s, index, i)){
                list.add(s.substring(index, i+1));
                recursion(s, i+1, result, list);
                list.remove(list.size() -1);
            }
        }
    }

    static boolean isPalindrome(String s, int i, int j){
        while( i< j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}