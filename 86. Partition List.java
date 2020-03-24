/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
		ListNode newcur=dummy;
		ListNode cur=head;
		while(cur!=null) {
			if(cur.val<x) {
				newcur.next=new ListNode(cur.val);
				newcur=newcur.next;
			}
			cur=cur.next;
		}
		cur=head;
		while(cur!=null) {
			if(cur.val>=x) {
				newcur.next=new ListNode(cur.val);
				newcur=newcur.next;
			}
			cur=cur.next;
		}
		return dummy.next;
	}

}