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
        postorder(root);
        return max;
    }
    public int[] postorder(TreeNode root){
        if(root==null)
            return new int[]{0,0};
        int[] left=postorder(root.left);
        int[] right=postorder(root.right);
        int[] r=new int[]{1,1};
        if(root.left!=null && root.val-1==root.left.val)
            r[0]=left[0]+1;
        if(root.left!=null && root.val+1==root.left.val)
            r[1]=left[1]+1;
        if(root.right!=null && root.val-1==root.right.val)
            r[0]=Math.max(r[0],1+right[0]);
        if(root.right!=null && root.val+1==root.right.val)
            r[1]=Math.max(r[1],1+right[1]);
            max=Math.max(max,r[0]+r[1]-1);
        return r;
        
    }
}