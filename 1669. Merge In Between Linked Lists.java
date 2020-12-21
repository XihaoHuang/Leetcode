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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode current1=list1;
        ListNode current=dummy;
        int count=0;
        while(current1!=null && count!=a){
            count++;
            current.next=new ListNode(current1.val);
            current=current.next;
            current1=current1.next;
        }
        current.next=list2;
        while(current.next!=null){
            current=current.next;
        }
        while(current1!=null && count!=b){
            count++;
            current1=current1.next;
        }
        current.next=current1.next;
        return dummy.next;
    }
}