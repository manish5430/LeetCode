class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        
        path.add(0);
        dfs(graph, 0, path, list);
        return list;
    }

    static void dfs(int[][] graph, int row, ArrayList<Integer> path, 
                                                ArrayList<List<Integer>> list){
        if(row == graph.length -1){
            list.add(new ArrayList<>(path));
            return;
        }

        for(int i : graph[row]){
            path.add(i);
            dfs(graph, i, path, list);
            path.remove(path.size() -1);
        }
    }
}