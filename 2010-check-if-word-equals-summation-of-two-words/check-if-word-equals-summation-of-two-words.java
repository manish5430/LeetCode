class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        for(char c : firstWord.toCharArray()){
            sb.append(c -'a');
        }
        for(char c : secondWord.toCharArray()){
            sb2.append(c -'a');
        }
        for(char c : targetWord.toCharArray()){
            sb3.append(c -'a');
        }
        int num = Integer.parseInt(sb.toString());
        int num2 = Integer.parseInt(sb2.toString());
        int num3 = Integer.parseInt(sb3.toString());

        return num+num2 == num3; 
    }
}