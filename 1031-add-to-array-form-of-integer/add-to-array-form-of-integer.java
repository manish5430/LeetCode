class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
      List<Integer> ans = new ArrayList();

      int i = num.length -1;
      int carry = 0;

      while( i >=0 ||  k >0 ){
        int value = 0;

        if( i >= 0){
            value = num[i];
        }

        int l = k % 10;
        int sum = value + l + carry;

        int digit = sum % 10;
        carry = sum / 10;

        ans.add(digit);

        i--;
        k = k/10;
      }
      
    if( carry > 0){
        ans.add(carry);
    }
    
    Collections.reverse(ans);

    return ans;
    }
}