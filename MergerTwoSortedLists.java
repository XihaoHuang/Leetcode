/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c3=new ListNode(-100);
        ListNode l3=c3;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                c3.next=l1;
                l1=l1.next;
            }
            else{
                c3.next=l2;
                l2=l2.next;
            }
            c3=c3.next;
        }
        if(l1!=null) c3.next=l1;
        if(l2!=null) c3.next=l2;
    
    return l3.next;
    }
}