/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int length=1;
		ListNode c=head;
		while(c.next!=null) {
			c=c.next;
			length++;
		}
		c.next=head;
		int p=k%length;
		ListNode b=c;
		for(int i=0;i<(length-p);i++) {
			b=b.next;
		}
		head=b.next;	
		b.next=null;
	   return head;
    }
}