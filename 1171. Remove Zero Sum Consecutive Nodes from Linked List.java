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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode c=dummy;
        int sum=0;
        while(c!=null){
            sum+=c.val;
            map.put(sum,c);
            c=c.next;
        }
        sum=0;
        c=dummy;
        while(c!=null){
            sum+=c.val;
            c.next=map.get(sum).next;
            c=c.next;
        }
        return dummy.next;
    }
}