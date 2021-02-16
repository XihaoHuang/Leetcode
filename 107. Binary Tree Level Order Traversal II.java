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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        list=new ArrayList<>();
        order(root,0);
        return list;
    }
    public void order(TreeNode node,int level){
        if(node==null) return;
        if(level>=list.size())
            list.add(0,new ArrayList<Integer>());
        order(node.left,level+1);
        order(node.right,level+1);
        list.get(list.size()-level-1).add(node.val);
    }
}