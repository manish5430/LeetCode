class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        recursion(s, 0, list, list1);  
        return list;
    }

    static void recursion(String s, int index, List<List<String>> list,
                           List<String> list1){
        
        if(index == s.length()){
            list.add(new ArrayList<>(list1));
            return;
        }

        for(int j = index; j< s.length(); j++){
            if(isPalindrome(s, index, j)){
                list1.add(s.substring(index, j+1));
                recursion(s, j +1, list, list1);
                list1.remove(list1.size() -1);
            }
        }
    }

    static boolean isPalindrome(String s, int i, int j){
        while(i< j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}