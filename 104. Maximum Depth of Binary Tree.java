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
    public static int max;
    public int maxDepth(TreeNode root) {
        max=0;
        loop(root,0);
        return max;
    }
    public static void loop(TreeNode root,int level){
        if(root!=null){
            level++;
            max=max>level? max: level;
            loop(root.left,level);
            loop(root.right,level);
        }else{
            return ;
        }
    }
}