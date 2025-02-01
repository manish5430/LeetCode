class Solution {
    static HashMap<String, Boolean> map = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        map.clear();
        if(s1.length() != s2.length()) return false;
        if(s1.isEmpty() && s2.isEmpty()) return true;

        return dfs(s1, s2);
    }

    static boolean dfs(String s1, String s2){
        if(s1.equals(s2)) return true;
        if(s1.length() <= 1) return false;

        StringBuilder sb = new StringBuilder();
        sb.append(s1).append(" ").append(s2);
        String s = sb.toString();
        
        if(map.containsKey(s)) return map.get(s);
        
        int n = s1.length();
        boolean flag = false;

        for(int i = 1; i< n; i++){
            if((dfs(s1.substring(0, i),s2.substring(n-i, n)) && 
                dfs(s1.substring(i, n), s2.substring(0, n-i)))  ||

                (dfs(s1.substring(0, i), s2.substring(0, i)) && 
                dfs(s1.substring(i, n), s2.substring(i, n))) ){

                    flag = true;
                    break;
            }
        }
        
        if(flag == true) map.put(s, true);
        else map.put(s, false);

        return flag;
    }
}