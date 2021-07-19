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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Map<Integer,List<Integer>> map=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> cq=new LinkedList<>();
        q.add(root);
        cq.add(0);
        int min=0;
        int max=0;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            int index=cq.poll();
            if(!map.containsKey(index))
                map.put(index,new ArrayList<>());
            map.get(index).add(temp.val);
            if(temp.left!=null){
                q.add(temp.left);
                cq.add(index-1);
                min=Math.min(min,index-1);
            }
            if(temp.right!=null){
                q.add(temp.right);
                cq.add(index+1);
                max=Math.max(max,index+1);
            }
        }
        for(int i=min;i<=max;i++)
            list.add(map.get(i));
        return list;
    }
}