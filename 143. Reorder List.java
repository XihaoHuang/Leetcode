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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode mid=head;
        ListNode second=head;
        while(second.next!=null && second.next.next!=null){
            mid=mid.next;
            second=second.next.next;
        }
        ListNode reversemid=mid;
        ListNode c=mid.next;
        while(c.next!=null){
            ListNode temp=c.next;
            c.next=temp.next;
            temp.next=reversemid.next;
            reversemid.next=temp;
        }
        c=head;
        ListNode cur=reversemid.next;
        while(c!=mid){
            reversemid.next=cur.next;
            cur.next=c.next;
            c.next=cur;
            c=cur.next;
            cur=reversemid.next;
        }
    }
}