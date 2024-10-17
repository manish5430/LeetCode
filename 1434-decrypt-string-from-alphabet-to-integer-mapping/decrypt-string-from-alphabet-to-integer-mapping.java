class Solution {
    public String freqAlphabets(String s) {
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i< s.length();){
        int number;
        if((i +2) < s.length()  && s.charAt(i+2) == '#'){
            number = (s.charAt(i) -'0') * 10  + (s.charAt(i+1) - '0');
            i = i+3;
        }
        else{
            number = s.charAt(i) - '0';
            i++;
        }
        sb.append((char)(number + 96));
       }
       return sb.toString();
       
    }
}