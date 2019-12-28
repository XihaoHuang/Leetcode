/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode c=head;
            int i=1;
       while(c!=null){ 
           i=1;
        reverse(c,k);
        while(c!=null && i<=k){
            c=c.next;
            i++;
        }
       }
        return head;
    }

    public ListNode reverse(ListNode l,int k){
        if(k<2) return l;
        ListNode c=l;
        ListNode c1=c;
            int temp=c.val,i=1;
            while(i<k && c1!=null){
                c1=c1.next;
                i++;
            }
           if(c1==null) return l; 
            c.val=c1.val;
            c1.val=temp;
            c=c1;
            c=c.next;
        
        reverse(l.next,k-2);
        return l;
    }
}
