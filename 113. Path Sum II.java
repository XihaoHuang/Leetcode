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
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        search(root,targetSum,new ArrayList<>());
        return list;
    }
    public void search(TreeNode root,int targetSum,List<Integer> al){
        if(root==null) return;
        al.add(root.val);
        if(root.val==targetSum && root.left==null && root.right==null){ 
            list.add(new ArrayList(al));
        }
        else{
            search(root.left,targetSum-root.val,al);
            search(root.right,targetSum-root.val,al);
        }
        al.remove(al.size()-1);
    }
}