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
    public List<Integer> list=new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        dfs(root,1);
        return list;
    }
    public void dfs(TreeNode root,int level){
        if(root==null) return;
        if(list.size()<level)
            list.add(Integer.MIN_VALUE);
        list.set(level-1,Math.max(list.get(level-1),root.val));
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
}