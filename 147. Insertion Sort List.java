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
    static ListNode sorthead;
    public ListNode insertionSortList(ListNode head) {
        sorthead=new ListNode(0);
        ListNode cur=head;
        while(cur!=null){
            insert(sorthead,cur);
            cur=cur.next;
        }
        return sorthead.next;
    }
    public static void insert(ListNode head,ListNode node){
        ListNode cur=head;
        while(cur.next!=null && cur.next.val<node.val){
            cur=cur.next;
        }
        ListNode newnode=new ListNode(node.val);
        newnode.next=cur.next;
        cur.next=newnode;
    }
}