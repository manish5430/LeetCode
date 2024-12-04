class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0; 
        int j = 0;

        while(i< str1.length() && j < str2.length()){
          if(str1.charAt(i)-'a' ==str2.charAt(j)-'a' ||(str1.charAt(i) -'a'+1)%26 ==(str2.charAt(j) -'a')){
            j++;
           }
           i++;            
        }
        
        return j == str2.length();

    }
}