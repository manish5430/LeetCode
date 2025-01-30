class Solution {
    public int magnificentSets(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i< n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            list.get(edge[0] -1).add(edge[1] -1);
            list.get(edge[1] -1).add(edge[0] -1);
        }

        // color check 
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i = 0; i< n; i++){
            if(color[i] == -1){
                if(! bipartite(i, list, color)){
                    return -1;   // question asked for -1 incase 
                }
            }
        }

        // get the longest length from a node 
        int[] distances = new int[n];
        for(int i = 0; i< n; i++){
            distances[i] = bfs(i, list, n);
        }

        // get the max number of groups
        int max = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i< n; i++){
            if(visited[i]) continue;
            max += groups(i, list, distances, visited);            
        }
        
        return max;       
    }

    static boolean bipartite(int node, ArrayList<ArrayList<Integer>> graph, int[] color){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        color[node] = 0;

        while(! queue.isEmpty()){
            int node1 = queue.poll();
            for(int num : graph.get(node1)){
                if(color[num] != -1){
                    if(color[num] == color[node1]){
                        return false;
                    }
                }
                else{
                    color[num] = 1 - color[node1];
                    queue.offer(num);
                }
            }
        }
        return true;
    }

    static int bfs(int node, ArrayList<ArrayList<Integer>> graph, int n){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(node);
        visited[node] = true; 
        int len = 0;

        while(! queue.isEmpty()){
            int level = queue.size();
            for(int i = 0; i< level; i++){
                int node1 = queue.poll();
                for(int num : graph.get(node1)){
                    if(visited[num]) continue;
                    visited[num] = true;       // mark them true 
                    queue.add(num);           // nothin just simple add them in queue   
                }
            }
            len++;   // count it with level 1 2 3 
        }
        return len;
    }

    static int groups(int node, ArrayList<ArrayList<Integer>> graph,
                                        int[] distances, boolean[] visited){
        int max = distances[node];
        visited[node] = true;

        for(int num : graph.get(node)){
            if(visited[num]) continue;
            max = Math.max(max, groups(num, graph, distances, visited));
        }
        return max;
    }
}