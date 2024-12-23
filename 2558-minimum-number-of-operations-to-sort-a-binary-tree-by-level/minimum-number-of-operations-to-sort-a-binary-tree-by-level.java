/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int totalSwaps = 0;

        // Bfs 
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int[] levelvalues = new int[levelSize];

            for(int i = 0; i< levelSize; i++){
                TreeNode node = queue.poll();
                levelvalues[i] = node.val;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            totalSwaps += getMinSwaps(levelvalues);
        }

        return totalSwaps;
    }

    static int getMinSwaps(int[] nums){
        int swaps = 0;
        int[] target = nums.clone();
        Arrays.sort(target);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i< nums.length; i++){
            if(nums[i] != target[i]){
                swaps++;

                int map1 = map.get(target[i]);
                map.put(nums[i], map1);
                nums[map1] = nums[i];
            }
        }
        return swaps;
    }
}