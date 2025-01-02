class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>(wordDict);
        StringBuilder sb = new StringBuilder();

        recursion(s, list, set, 0, sb);
        return list;

    }

    static void recursion(String s, ArrayList<String> list,HashSet<String> set, int index, 
        StringBuilder sb){
        if(index == s.length()){
            list.add(sb.toString().trim());  
            // should only add a string to list when the entire string s has been processed
            return;
        }

        //StringBuilder sb = new StringBuilder();
        for(int i = index; i< s.length(); i++){
            if(set.contains(s.substring(index, i+1))){

                int length = sb.length();  // previous length 
                sb.append(s.substring(index, i+1)).append(" ");
                recursion(s, list, set, i +1, sb);

                // list.add(sb.toString().trim());  you're adding the sb content every time a valid substring is found, even if it doesn't cover the entire string.
                sb.delete(length, sb.length());
            }
        }        
    }
}