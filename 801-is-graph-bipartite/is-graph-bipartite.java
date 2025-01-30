class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i = 0; i< n; i++){
            if(color[i] == -1){
                if(! dfs(i, graph, color)){
                    return false;
                }
            }
        }
        return true;        
    }

    static boolean dfs(int node, int[][] graph, int[] color){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        color[node] = 0;

        while(!queue.isEmpty()){
            int node1 = queue.poll();
            for(int num : graph[node1]){
                if(color[num] == -1){
                    color[num] = 1 - color[node1];
                    queue.offer(num);
                }else{
                    if(color[num] == color[node1]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}