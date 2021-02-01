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
    public boolean isValidBST(TreeNode root) {
        
        return BST(root,null,null);
    }
    public static boolean BST(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;
        if((min!=null && root.val<=min.val) || (max!=null && root.val>=max.val )) return false;
        return BST(root.left,min,root) && BST(root.right,root,max);
    }
    
}