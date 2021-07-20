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
    Map<Integer,Integer> map=new HashMap<>();
    int count=0;
    int size=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        preorder(root);
        int[] ans=new int[size];
        for(int i:map.keySet()){
            if(map.get(i)==count)
                ans[--size]=i;
        }
        return ans;
    }
    public int preorder(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        int left=preorder(root.left);
        int right=preorder(root.right);
        int val=root.val;
        if(left!=Integer.MAX_VALUE)
            val+=left;
        if(right!=Integer.MAX_VALUE)
            val+=right;
        map.put(val,map.getOrDefault(val,0)+1);
        if(map.get(val)==count){
            size++;
        }else if(map.get(val)>count){
            count=map.get(val);
            size=1;
        }
        return val;
    }
}