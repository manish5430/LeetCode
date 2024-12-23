class Solution {
    public List<String> generateParenthesis(int n) {

        int openCount = n;
        int closeCount = n;

        return recursion("", openCount, closeCount);      


    }

    static ArrayList<String> recursion(String p, int openCount, int closeCount){
        ArrayList<String> list = new ArrayList<>();
        if(openCount == 0 && closeCount == 0){
            list.add(p);
            return list;
        }

        if(openCount != 0){
            list.addAll(recursion(p + '(', openCount -1, closeCount));
        }
        if(openCount < closeCount){
            list.addAll(recursion(p + ')', openCount, closeCount -1));
        }
        
        return list;
    }
}
