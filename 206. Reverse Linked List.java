/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode last=head;
        ListNode spot=last.next;
        while(spot!=null){
            last.next=spot.next;
            spot.next=head;
            head=spot;
            spot=last.next;
        }
        return head;
        }

}