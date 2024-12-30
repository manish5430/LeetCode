class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        int n = s.length();

        recursion(s, 0, new ArrayList<>(), list, n);
        return list;
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

    static void recursion(String s, int partition, List<String> list1, List<List<String>> list, int n){
        if(partition == n){
            list.add(new ArrayList<>(list1));
            return;
        }

        // this partition would be 0 at starting and then keep on adding more letters 
        for(int i = partition; i< n; i++){
            if(isPalindrome(s, partition, i)){

                list1.add(s.substring(partition, i+1));
                recursion(s, i +1, list1, list, n);

                list1.remove(list1.size() -1);
            }
        }
    }
}