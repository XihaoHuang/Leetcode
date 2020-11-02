/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        ListNode first=head,second=head;
        while(second.next!=null && second.next.next!=null){
            first=first.next;
            second=second.next.next;
        }
        if(second.next!=null) first=first.next;
        ListNode cur=head;
        while(cur.next!=null && cur.next!=first){
            ListNode next=cur.next;
            cur.next=next.next;
            next.next=head;
            head=next;
        }
        cur=head;
        ListNode c;
        if(second.next==null)
            c=first.next;
        else
           c=first;
        while(c!=null){
        // System.out.print(c.val+" "+cur.val);
            if(cur.val!=c.val) return false;
            c=c.next;
            cur=cur.next;
        }
        return true;
    }
}