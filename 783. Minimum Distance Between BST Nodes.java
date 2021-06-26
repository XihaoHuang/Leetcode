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
    int res=Integer.MAX_VALUE,pre=res;
    public int minDiffInBST(TreeNode root) {
        if(root.left!=null) minDiffInBST(root.left);
        if(pre!=Integer.MAX_VALUE) res=Math.min(res,root.val-pre);
        pre=root.val;
        if(root.right!=null) minDiffInBST(root.right);
        return res;
    }
}