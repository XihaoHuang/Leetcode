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
        preorder(root,target,k);
        return new ArrayList<>(q);
    }
    public void preorder(TreeNode root,double t,int k){
        if(root==null) return ;
        preorder(root.left,t,k);
        if(q.size()<k)
            q.add(root.val);
        else{
            if(Math.abs(q.peek()-t)>Math.abs(root.val-t)){
                q.remove();
                q.add(root.val);
            }else{
                return;
            }
        }
        
        preorder(root.right,t,k);
    }
}