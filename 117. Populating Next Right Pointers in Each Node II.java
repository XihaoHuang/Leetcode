/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node curlevel=root;
        Node headnode=new Node(-1);
        Node curnode=headnode;
        while(curlevel!=null){
            if(curlevel.left!=null){
                curnode.next=curlevel.left;
                curnode=curnode.next;
            }
            if(curlevel.right!=null){
                curnode.next=curlevel.right;
                curnode=curnode.next;
            }
            if(curlevel.next!=null)
                curlevel=curlevel.next;
            else{
                curlevel=headnode.next;
                headnode.next=null;
                curnode=headnode;
            }
        }
        return root;
    }
}