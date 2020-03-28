
  Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    public ListInteger inorderTraversal(TreeNode root) {
        ListInteger list=new ArrayList();
        inorder(list,root);
        return list;
    }
    public static void inorder(ListInteger list,TreeNode root){
        if(root==null)
            return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
}