class Solution {
    static String result;
    static int count;
    public String getHappyString(int n, int k) {
        result = "";
        count = 0;

        backtrack(n, k, new StringBuilder(""));
        return result;        
    }

    static boolean backtrack(int n, int k, StringBuilder sb){
        if(sb.length() == n){
            count++;
            if(count == k){
                result = sb.toString();
                return true;
            }
            return false;
        }

        for(char ch = 'a'; ch<= 'c'; ch++){
            if(sb.length()> 0  &&  sb.charAt(sb.length() -1) == ch) continue;
            sb.append(ch);

            if(backtrack(n, k, sb)) return true;
            sb.deleteCharAt(sb.length() -1);
        }
        return false;
    }

}