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
    List<List<Integer>> list;
    public List<List<Integer>> findLeaves(TreeNode root) {
        list=new ArrayList<>();
        preorder(root);
        return list;
    }
    public int preorder(TreeNode root){
        if(root==null) return 0;
        int index=1+Math.max(preorder(root.left),preorder(root.right));
        if(list.size()<index)
            list.add(new ArrayList<>());
        list.get(index-1).add(root.val);
        return index;
    }
}