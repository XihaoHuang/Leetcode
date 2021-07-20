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
    List<Integer> list;
    int count=0;
    int max=0;
    TreeNode pre;
    public int[] findMode(TreeNode root) {
        list=new ArrayList<>();
        preorder(root);
        int[] ans =new int[list.size()];
        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);
        return ans;
    }
    public void preorder(TreeNode root){
        if(root==null) return;
        preorder(root.left);
        if(pre!=null && pre.val==root.val)
            count++;
        else
            count=1;
        
        if(count==max)
            list.add(root.val);
        else if(count>max){
            max=count;
            list=new ArrayList<>();
            list.add(root.val);
        }
        
        pre=root;
        preorder(root.right);
        
    }
}