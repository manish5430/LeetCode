class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        return phonePad("", digits);
        
    }

    static ArrayList<String> phonePad(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.length() == 0){
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) -'0';
        if(digit < 7 ){
            for(int i = (digit -2)*3; i< ((digit -2)*3)+3; i++){
                char ch = (char)(i + 'a');

                list.addAll(phonePad(p + ch, up.substring(1)));
            }
        }
        else if(digit == 7){
            for(int i = 15; i< 19; i++){
                char ch = (char)(i + 'a');
                list.addAll(phonePad(p + ch, up.substring(1)));
            }
        }
        else if(digit == 8){
            for(int i = 19; i< 22; i++){
                char ch = (char)(i+ 'a');
                list.addAll(phonePad(p + ch, up.substring(1)));
            }
        }else if(digit == 9){
            for(int i = 22; i< 26; i++){
                char ch = (char)(i +'a');
                list.addAll(phonePad(p+ch, up.substring(1)));
            }
        }
        
        return list;
    }
}