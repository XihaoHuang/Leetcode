/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ListNode Evenhead=new ListNode(0);
        int i=1;
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
                ListNode even=cur.next;
                cur.next=even.next;
                even.next=null;
                ListNode c=Evenhead;
                while(c.next!=null)
                    c=c.next;
                c.next=even;
                cur=cur.next;
            
        }
        cur=head;
        while(cur.next!=null)
            cur=cur.next;
        cur.next=Evenhead.next;
        return head;
    }
}