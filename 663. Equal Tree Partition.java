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
    public  Set<Integer> set=new HashSet<>();
    public boolean checkEqualTree(TreeNode root) {
        int sum=root.val+dfs(root.left)+dfs(root.right);
        return sum%2==0 && set.contains(sum/2);
    }
    public int dfs(TreeNode root){
        if(root==null) return 0;
        int sum=root.val+dfs(root.left)+dfs(root.right);
        set.add(sum);
        return sum;
    }
}