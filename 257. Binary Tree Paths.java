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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        dfs(root,"",list);
        return list;
    }
    public void dfs(TreeNode root,String s,List<String> list){
        if(root.left==null && root.right==null){
            s+=root.val;
            list.add(s);
        }
        if(root.left!=null)
            dfs(root.left,s+root.val+"->",list);
        if(root.right!=null)
            dfs(root.right,s+root.val+"->",list);
        
    }
}