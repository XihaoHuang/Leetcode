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
    public boolean isSymmetric(TreeNode root) {
        return compare(root,root);
    }
    public static boolean compare(TreeNode q,TreeNode p){
        if(q==null && p==null) return true;
        if(q==null || p==null) return false;
        return q.val==p.val && compare(q.left,p.right) && compare(q.right,p.left);
    }
}