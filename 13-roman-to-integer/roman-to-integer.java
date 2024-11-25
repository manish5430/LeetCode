class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> Map = new HashMap<>();
        Map.put('I', 1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);

        int ans = 0;
        for(int i = s.length()-1; i>=0; i--){
            if(i< s.length()-1  &&  Map.get(s.charAt(i+1)) > Map.get(s.charAt(i))){
                ans = ans - Map.get(s.charAt(i));           
            }
            else{
                ans += Map.get(s.charAt(i)); 
            }
        }
        return ans;
    }
}