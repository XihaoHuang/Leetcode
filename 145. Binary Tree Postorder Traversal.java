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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list=new LinkedList<>();
        Stack<TreeNode> s=new Stack<>();
        if(root==null) return list;
        s.push(root);
        while(!s.isEmpty()){
            TreeNode cur=s.pop();
            list.addFirst(cur.val);
            if(cur.left!=null)
                s.push(cur.left);
            if(cur.right!=null)
                s.push(cur.right);
        }
        return list;
    }
}