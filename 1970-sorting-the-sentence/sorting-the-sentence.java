class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] arr = new String[str.length];
        for(String word : str){
           int n = word.length();

           int num = word.charAt(n-1) -'0';
           arr[num -1] = word.substring(0, n-1);
        }

        return String.join(" ", arr);


    }
}