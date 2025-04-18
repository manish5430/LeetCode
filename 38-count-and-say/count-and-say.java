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
        int count = 1;

        for(int i = 0; i< arr.length; i++){
            char ch = arr[i];
            //int count = 1;

            while(i+1 < arr.length && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            sb.append(count).append(ch);
            count = 1;
            
        }
        return sb.toString();
    }
}