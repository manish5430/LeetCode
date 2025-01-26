class Solution {
    public int maximumInvitations(int[] favorite) {
        int n = favorite.length;
        boolean[] visited = new boolean[n];
        ArrayList<int[]> list = new ArrayList<>();   // to store len 2 
        int max = 0;

        for(int i = 0; i< n; i++){
            if(visited[i]) continue; 
            HashSet<Integer> set = new HashSet<>();
            int start = i;
            int current = i;

            while(! visited[current]){
                visited[current] = true;
                set.add(current);
                current = favorite[current];
            }
            int len = set.size();
            while(start != current){
                len--;
                start = favorite[start];
            }

            max = Math.max(max, len);
            if(len == 2){
                list.add(new int[]{current, favorite[current]});
            }
        }

        List<List<Integer>> reverseList = new ArrayList<>();
        for(int i = 0; i< n; i++){
            reverseList.add(new ArrayList<>());
        }
        for(int i = 0; i< n; i++){
            reverseList.get(favorite[i]).add(i);
        }
        int max2 = 0;
        for(int[] arr : list){
            max2 += f(arr[0], arr[1], reverseList) + f(arr[1], arr[0], reverseList) + 2;
        }
        return Math.max(max2, max);
    }

    private int f(int node, int skip, List<List<Integer>> reverseList){
        int len=0;
        // [node, len]
        Queue<int[]> queue = new LinkedList<>();
        // queue.offer(node);
        queue.offer(new int[]{node, 0});
        while(!queue.isEmpty()){
            int cur[] = queue.poll();
            len = Math.max(len, cur[1]);
            for(int neighbour:reverseList.get(cur[0])){
                if(neighbour == skip) continue;
                queue.offer(new int[]{neighbour, cur[1] + 1});
            }
        }
        return len;
    }
}