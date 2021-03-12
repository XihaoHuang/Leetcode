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
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(0,nums.length-1,nums);
    }
    public static TreeNode BST(int start,int end,int[] n){
        if(start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(n[mid]);
        root.left=BST(start,mid-1,n);
        root.right=BST(mid+1,end,n);
        return root;
    }
}