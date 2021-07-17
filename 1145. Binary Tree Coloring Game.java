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
    int left,right,val;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        val=x;
        postorder(root);
        return Math.max(Math.max(left,right),n-left-right-1)>n/2 ;
    }
    public int postorder(TreeNode root){
        if(root==null) return 0;
        int l=postorder(root.left);
        int r=postorder(root.right);
        if(root.val==val){
            left=l;
            right=r;
        }
        return l+r+1;
    }
}