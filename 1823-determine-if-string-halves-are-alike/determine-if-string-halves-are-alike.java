class Solution {
    public boolean halvesAreAlike(String s) {
       char[] arr = s.toCharArray();
       int n = arr.length;
       int mid = n/2;

       char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

       int count = 0; 
       for(int x= 0; x< mid; x++){
        for(int i = 0; i< vowels.length; i++){
            if( arr[x] == vowels[i]){
                count++;
            }
        }
       }
       int num = 0; 
       for(int x= mid; x< n; x++){
        for(int i = 0; i< vowels.length; i++){
            if( arr[x] == vowels[i]){
                num++;
            }
        }
       }

        if( count == num){
            return true; 
        }
        return false;

       
    }
}