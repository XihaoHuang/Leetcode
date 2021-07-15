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
    int max=1;
    public int longestConsecutive(TreeNode root) {
        preorder(root,1);
        return max;
    }
    public void preorder(TreeNode root, int count){
        max=Math.max(max,count);
        if(root.left!=null){
            if(root.val+1==root.left.val)
                preorder(root.left,count+1);
            else
                preorder(root.left,1);
            
        }
        if(root.right!=null){
            if(root.val+1==root.right.val)
                preorder(root.right,count+1);
            else
                preorder(root.right,1);
        }
    }
}