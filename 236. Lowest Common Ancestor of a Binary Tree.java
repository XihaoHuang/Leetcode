/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root,p,q);
        return ans;
    }
    public boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) 
            return false;
        if(root.val==q.val){
            ans=new TreeNode(q.val);
            return true;
        }
        if(root.val==p.val){
            ans=new TreeNode(p.val);
            return true;
        }
        boolean left=dfs(root.left,p,q);
        boolean right=dfs(root.right,p,q);
        if(left && right)
            ans=new TreeNode(root.val);
        return left || right;
    }
}