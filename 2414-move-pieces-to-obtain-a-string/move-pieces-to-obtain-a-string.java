class Solution {
    public boolean canChange(String start, String target) {
        int i = 0;  //  start index 
        int j = 0;  // target index 
        int n = start.length();

        while(i < n && j < n){
            while( i < n  && start.charAt(i) == '_'){
                i++;
            }
            while( j < n  && target.charAt(j) == '_'){
                j++;
            }

            if(i < n && j < n){
                if(start.charAt(i) != target.charAt(j)){
                    return false;
                }
                if(target.charAt(j) == 'L'  &&  i < j){
                    return false;
                }
                if(target.charAt(j) == 'R'  &&  i > j){
                    return false;
                }

                i++;
                j++;
            }
        }

        while(i< n){
            if(start.charAt(i) != '_'){
                return false;
            }
            i++;
        }

        while(j< n){
            if(target.charAt(j) != '_'){
                return false;
            }
            j++;
        }

        return true;
    }
}