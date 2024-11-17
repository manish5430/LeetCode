class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i = 0;
        if(ruleKey.equals("type")) i = 0; 
        if(ruleKey.equals("color")) i = 1;
        if(ruleKey.equals("name"))  i = 2;

        int count = 0;
        for(List<String> num : items){
            if(ruleValue.equals(num.get(i))){
                count++;
            }
        }
        return count;
    }
}