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

                // after removing all the _ the elemenet must match 
                if(start.charAt(i) != target.charAt(j)){
                    return false;
                }

                // if the element matches but the posistion is different 
                if(target.charAt(j) == 'L'  &&  i < j){  // i cant move forward for L
                    return false;
                }
                if(target.charAt(j) == 'R'  &&  i > j){  // i cant move backward for R
                    return false;  
                }

                i++;
                j++;
            }
        }
        
        //  after all the L R s if anything left just return false;
        
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