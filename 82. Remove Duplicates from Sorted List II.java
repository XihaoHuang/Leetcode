/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode newhead=new ListNode(-999);
		ListNode newcur=newhead;
		while(head!=null) {
			if(head.next!=null && head.val==head.next.val) {
				while(head!=null && head.next!=null &&head.val==head.next.val)
					head=head.next;
				head=head.next;
			}else {
				newcur.next=new ListNode(head.val);
				head=head.next;
				newcur=newcur.next;
			}
		}
		
		return newhead.next;
	
	}
}