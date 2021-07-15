/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node inorderSuccessor(Node node) {
        Node ans=node.right;
        while(ans!=null && ans.left!=null){
            ans=ans.left;
        }
        if(ans!=null) return ans;
        while(node.parent!=null && node.parent.val<node.val){
            node=node.parent;
        }
        return node.parent;
    }
}