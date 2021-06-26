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
    int val=Integer.MIN_VALUE;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        if(val==Integer.MIN_VALUE)
            val=root.val;
        return root.val==val && isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}