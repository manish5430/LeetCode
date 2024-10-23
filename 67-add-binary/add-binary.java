class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length();
        int j = b.length();
        int carry = 0;

        while(i > 0 || j > 0 || carry != 0){
            int sum = carry;
            
            if( i > 0){
                sum += a.charAt(i -1) - '0';
                i--;
            }
            if( j > 0){
                sum += b.charAt(j -1) - '0';
                j--;
            }

            carry = sum / 2; 
            sb.append(sum % 2);
        }
        return sb.reverse().toString();      
    }
}