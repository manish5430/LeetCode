class Solution {
    public List<String> letterCasePermutation(String s) {

        return recursion("", s);
        
    }

    static ArrayList<String> recursion(String p, String up){
        ArrayList<String> list = new ArrayList<>();
    
        if(up.length() == 0){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        if(Character.isLetter(ch)){
            char ch2 = Character.toUpperCase(ch);
            char ch3 = Character.toLowerCase(ch);

            list.addAll(recursion(p + ch3, up.substring(1)));
            list.addAll(recursion(p + ch2, up.substring(1)));
        }
        else{
            list.addAll(recursion(p + ch, up.substring(1)));
        }
    

        return list;
    }
}