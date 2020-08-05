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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        ListNode nodehead=head;
        while(nodehead!=null){
            ListNode cur=nodehead.next;
            while(cur!=null){
              if(cur.val<nodehead.val){
                    int temp=nodehead.val;
                    nodehead.val=cur.val;
                    cur.val=temp;
                }
                cur=cur.next;
            }
            nodehead=nodehead.next;
        }
        return head;
    }
}