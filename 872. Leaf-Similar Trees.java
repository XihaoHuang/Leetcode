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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        preorder(root1,s1);
        preorder(root2,s2);
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop()!=s2.pop())
                return false;
        }
        return s1.isEmpty() && s2.isEmpty();
    }
    public void preorder(TreeNode root,Stack<Integer> s){
        if(root==null) return;
        preorder(root.left,s);
        if(root.left==null && root.right==null){
            s.push(root.val);
            return;
        }
        preorder(root.right,s);
    }
}