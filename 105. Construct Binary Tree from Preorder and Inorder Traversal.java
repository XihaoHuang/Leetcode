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
    static int preIndex;    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex=0;
        return buildTree(preorder,inorder,0,inorder.length);
    }
    public TreeNode buildTree(int[] preorder,int[] inorder,int start,int end){
        if(start>end)
            return null;
        if(preIndex==preorder.length)
            return null;
        TreeNode root=new TreeNode(preorder[preIndex++]);
        if(start==end)
            return root;
        int inIndex=findindex(inorder,start,end,root.val);
        root.left=buildTree(preorder,inorder,start,inIndex-1);
        root.right=buildTree(preorder,inorder,inIndex+1,end);
        return root;
    }
    public int findindex(int[] inorder,int start,int end,int val){
        int i;
        for(i=start;i<=end;i++){
            if(inorder[i]==val)
                return i;
        }
        return i;
    }
}