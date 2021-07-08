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
    TreeNode first=null;
    TreeNode second=null;
    TreeNode pre=null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(first==null && (pre==null ||pre.val>=root.val)){
            first=pre;
        }
        if(first!=null && pre.val>=root.val){
            second=root;
        }
        pre=root;
        System.out.println((first==null? -1: first.val)+" "+root.val+" "+(second==null? -1: second.val));
        inorder(root.right);
    }
}