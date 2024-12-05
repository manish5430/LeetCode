class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> Map = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String word1 = new String(arr);
            
            if(!Map.containsKey(word1)){
                Map.put(word1, new ArrayList<>());
            }
            Map.get(word1).add(word);
            
        }

        return new ArrayList<>(Map.values());
    }
}