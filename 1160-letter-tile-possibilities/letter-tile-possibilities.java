class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        recursion(arr, visited, sb, set);
        return set.size();
    }

    static void recursion(char[] arr, boolean[] visited, StringBuilder sb, HashSet<String>set){
        if(sb.length() > 0){
            set.add(sb.toString());
        }

        for(int i = 0; i< arr.length; i++){
            if(visited[i] || i> 0 && arr[i] == arr[i-1] && !visited[i-1]) continue;

            visited[i] = true;
            sb.append(arr[i]);
            recursion(arr, visited, sb, set);
            sb.deleteCharAt(sb.length() -1);
            visited[i] = false;
        }
    }
}