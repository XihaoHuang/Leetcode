/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        ListNode prev=null;       
        ListNode start=head;
        ListNode cur=start.next;
         int digit=1;
	        while(digit<n){
	            if(digit<m) {
	            	prev=start;
	            	start=start.next;
	            	cur=start.next;
                    digit++;
	            }else {
	            	if(prev==null) {
	            		start.next=cur.next;
	            		cur.next=head;
	            		head=cur;
	            	}else {
	            	reverse(prev,start,cur);
	            	
                    }
                    cur=start.next;
                        digit++;
	            	
	            }
	           
	        }
	        return head;
	    }
    public void reverse(ListNode prev,ListNode start,ListNode cur){
          start.next=cur.next;
	    		cur.next=prev.next;
	    		prev.next=cur;
    }
}