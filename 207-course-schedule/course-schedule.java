class Solution {    // this is Floyd-Warshall algorithm and it gives tle 
    public boolean canFinish(int n, int[][] pre) {
        int[] indegree = new int[n];
        ArrayList<List<Integer>> list = new ArrayList<>();  // adjacency list mapping 

        for(int i = 0; i< n; i++){
            list.add(new ArrayList<>());  // add empty list in each sublist 
        }
        for(int[] arr : pre){
            list.get(arr[1]).add(arr[0]);  // get that empty arr1 sublist and add arr0 in it
            indegree[arr[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i< n; i++){
            if(indegree[i] == 0) queue.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        while(! queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int num : list.get(node)){
                indegree[num]--;
                if(indegree[num] == 0) queue.offer(num);
            }
        }

        return n == result.size();

    }
}