class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i< words.length; i++){
            // left part 
            for(int left = 0; left < i; left++){
                if(words[left].contains(words[i])){
                    list.add(words[i]);
                }
            }
            // right part
            for(int right = i+1; right< words.length; right++){
                if(words[right].contains(words[i])){
                    list.add(words[i]);
                }
            }
        }
        set.addAll(list);
        return new ArrayList<>(set);
    }
}