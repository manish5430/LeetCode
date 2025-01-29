class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(map.containsKey(u) && map.containsKey(v)){
                boolean[] visited = new boolean[n+1];
                if(dfs(map, u, v, visited)){
                    return edge;
                }
            }
            map.putIfAbsent(u, new ArrayList<>());
            map.putIfAbsent(v, new ArrayList<>());
            map.get(u).add(v);
            map.get(v).add(u);
        }
        return new int[0];
    }

    static boolean dfs(HashMap<Integer, List<Integer>> map, int u, int v, boolean[] visited){
        visited[u] = true;

        if(u == v){
            return true;
        }

        for(int node : map.get(u)){
            if(visited[node]) continue;
            if(dfs(map, node, v, visited)){
                return true;
            }
        }
        return false;
    }
}