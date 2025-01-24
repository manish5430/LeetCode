class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int n = graph.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i< n; i++){
            if(dfs(i, graph, map)){
                result.add(i);
            }            
        }
        return result;
    }

    static boolean dfs(int node, int[][] graph, HashMap<Integer, Boolean> map){
        if(map.containsKey(node)){
            return map.get(node);
        }
        map.put(node, false);
        for(int num : graph[node]){
            if(! dfs(num, graph, map)){
                return false;
            }
        }
        map.put(node, true);
        return true;
    }
}