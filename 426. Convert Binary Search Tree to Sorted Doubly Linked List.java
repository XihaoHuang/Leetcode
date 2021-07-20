/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node head,cur;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        head=new Node(0,null,null);
        cur=head;
        inorder(root);
        cur.right=head.right;
        head.right.left=cur;
        return head.right;
    }
    public void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        cur.right=root;
        root.left=cur;
        cur=cur.right;
        inorder(root.right);
    }
}