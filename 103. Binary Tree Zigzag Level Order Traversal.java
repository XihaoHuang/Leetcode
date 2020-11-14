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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(root==null) return list;
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);
        TreeNode cur;
        while(!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            while(!s1.isEmpty()){
                cur=s1.pop();
                arr.add(cur.val);
                if(cur.left!=null) s2.push(cur.left);
                if(cur.right!=null) s2.push(cur.right);
            }
            list.add(arr);
            arr=new ArrayList<>();
            while(!s2.isEmpty()){
                cur=s2.pop();
                arr.add(cur.val);
                if(cur.right!=null) s1.push(cur.right);
                if(cur.left!=null) s1.push(cur.left);
            }
            if(!arr.isEmpty()) list.add(arr);
        }
        return list;
    }
}