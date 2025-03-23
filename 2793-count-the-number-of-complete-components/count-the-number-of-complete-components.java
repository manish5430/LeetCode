class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int[] edge : edges){
            dsu.union(edge[0], edge[1]);
        }

        for(int[] edge : edges){
            int root = dsu.find(edge[0]);
            map.put(root, map.getOrDefault(root, 0) +1);
        }

        int count = 0;
        for(int i = 0; i< n; i++){
            if(dsu.find(i) == i){
                int nodeCount = dsu.size[i];
                int edges1 = ((nodeCount) * ( nodeCount -1))/2;
                if(map.getOrDefault(i, 0) == edges1){
                    count++;
                }
            }
        }
        return count;
        
    }

    class DSU {

        int[] parent;
        int[] size;

        DSU( int n){
            parent = new int[n];
            size = new int[n];
            for(int i = 0; i< n; i++){
                parent[i] = i;
            }
            Arrays.fill(size, 1);
        }

        int find(int node){
            if(parent[node] == node){
                return node;
            }
            parent[node] = find(parent[node]);
            return parent[node];
        }

        void union(int node1, int node2){
            int parent1 = find(node1);
            int parent2 = find(node2);

            if(parent1 == parent2) return;

            if(size[parent1] > size[parent2]){
                parent[parent2] = parent1;
                size[parent1] += size[parent2];
            }else{
                parent[parent1] = parent2;
                size[parent2] += size[parent1];
            }
        }

    }
}