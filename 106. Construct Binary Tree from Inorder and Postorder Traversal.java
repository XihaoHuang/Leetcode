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
    public  int idx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       idx = postorder.length-1;
    return build(inorder, postorder, 0, idx);

    }
    private TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        if (start>end) return null;
        TreeNode node = new TreeNode(postorder[idx--]);
        if (start==end) return node;
        
        int index = findIdx(inorder, node.val, end);
        node.right = build(inorder, postorder, index+1, end);
        node.left = build(inorder, postorder, start, index-1);
        return node;
    }

   public int findIdx(int[] inorder, int val, int end) {
        for (int i=end; i>=0; i--) {
            if (inorder[i]==val) return i;
        }
        return 0;
    }
}