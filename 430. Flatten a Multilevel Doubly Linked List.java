/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node cur=head;
        while(cur!=null){
                Node childhead=cur.child;
                Node c=childhead;
            if(childhead!=null){
                while(c.next!=null)
                    c=c.next;
                if(cur.next!=null){
                    cur.next.prev=c;
                    c.next=cur.next;
                }
                cur.next=childhead;
                childhead.prev=cur;
                cur.child=null;
            }
            cur=cur.next;
        }
        return head;
    }
}