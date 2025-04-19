class Solution {
    public String countAndSay(int n) {

        String result = recursion(n, new StringBuilder());
        return result;        
    }

    static String recursion(int n, StringBuilder sb){
        if(n == 1){ 
            sb.append(1);
            return sb.toString();
        }

        String say = recursion(n-1, new StringBuilder());

        char[] arr = say.toCharArray();
        for(int i = 0; i< arr.length; i++){
            int count = 1;
            char c = arr[i];
            while(i+1 < arr.length && c == arr[i+1]){
                count++;
                i++;
            }
            sb.append(count).append(arr[i]);
        }
        
        return sb.toString();
    }
}