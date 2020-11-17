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
class BSTIterator {
    Stack<Integer> s=new Stack<>();
    public BSTIterator(TreeNode root) {
        pushvalue(root);
    }
    /** @return the next smallest number */
    public int next() {
        return s.pop();        
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }
    public void pushvalue(TreeNode root){
        if(root==null) return;
        if(root.right!=null) pushvalue(root.right);
        s.push(root.val);
        if(root.left!=null) pushvalue(root.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */