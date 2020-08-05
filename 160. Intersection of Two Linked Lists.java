/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode cur1=headA,cur2=headB;
        while(cur1!=null){
            l1++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            l2++;
            cur2=cur2.next;
        }
        cur1=headA;
        cur2=headB;
        if(l2>l1){
            int diff=l2-l1;
            while(diff--!=0) cur2=cur2.next;
        }
        if(l1>l2){
            int diff=l1-l2;
            while(diff--!=0) cur1=cur1.next;
        }
        while(cur1!=null){
            if(cur1==cur2)
                return cur1;
        cur1=cur1.next;
        cur2=cur2.next;
        }
        return null;
    }
}