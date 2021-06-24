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
    public int rob(TreeNode root) {
        return preorder(root)[1];
    }
    public int[] preorder(TreeNode root){
        if(root==null)
            return new int[2];
        int[] left=preorder(root.left);
        int[] right=preorder(root.right);
        int[] res=new int[2];
        res[0]=left[1]+right[1];
        res[1]=Math.max(res[0],left[0]+right[0]+root.val);
        return res;
    }
}