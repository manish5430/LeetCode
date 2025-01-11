class Solution {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder("");

        while(i < s.length()){
            if(Character.isLetter(s.charAt(i))) sb.append(s.charAt(i));
            
            else if(s.charAt(i) == ']') return sb.toString();

            else if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(Character.isDigit(s.charAt(i))){
                    num = num * 10 + Integer.valueOf(s.charAt(i) - '0');
                    i++;
                }
                i++;   // get past the ] closing bracket 

                String encoded = decodeString(s);
                
                while(num > 0){
                    sb.append(encoded);
                    num--;
                }
            }
            i++; // normal one 
        }
        return sb.toString();
        
    }
}