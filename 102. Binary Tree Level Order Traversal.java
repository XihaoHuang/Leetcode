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
    public static List<List<Integer>> list;
    public static int size;
    public List<List<Integer>> levelOrder(TreeNode root) {
        list=new ArrayList<List<Integer>>();
        size=0;
        level(root,0);
        return list;
    }
    public void level(TreeNode root,int l){
        if(root!=null){
            if(l>=size){
                List<Integer> arr=new ArrayList<>();
                arr.add(root.val);
                list.add(arr);
                size++;
            }else{
                list.get(l).add(root.val);
            }
            level(root.left,l+1);
            level(root.right,l+1);
        }else
            return ;
    }
}