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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null) return list;
        while(root!=null){
            list.add(root.val);
            if(root.right!=null){
                s.push(root.right);
            }
            root=root.left;
            if(root==null && !s.isEmpty()){
                root=s.pop();
            }
        }
        return list;
    }
}