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
    Queue<Integer> q;
    public List<Integer> closestKValues(TreeNode root, double target, int k) {
        q=new LinkedList<>();
        preorder(root);
        Queue<Integer> ans=new LinkedList<>();
        int size=0;
        while(size++<k)
            ans.add(q.remove());
        while(!q.isEmpty() && Math.abs(q.peek()-target)<Math.abs(ans.peek()-target)){
            ans.remove();
            ans.add(q.remove());
        }
        return new ArrayList<>(ans);
    }
    public void preorder(TreeNode root){
        if(root==null) return ;
        preorder(root.left);
        q.add(root.val);
        preorder(root.right);
    }
}