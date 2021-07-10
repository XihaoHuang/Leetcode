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
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        return  dfs(root,0,targetSum,map);
    }
    public int dfs(TreeNode root,int sum,int target,HashMap<Integer,Integer> map){
        if(root==null) return 0;
        sum+=root.val;
        int presum=map.getOrDefault(sum-target,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
        int ans=presum+dfs(root.left,sum,target,map)+dfs(root.right,sum,target,map);
        map.put(sum,map.get(sum)-1);
        return ans;
    }
}