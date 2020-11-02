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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        ListNode c1=l1;
        ListNode c2=l2;
        while(c1!=null){
            s1.push(c1);
            c1=c1.next;
        }
        while(c2!=null){
            s2.push(c2);
            c2=c2.next;
        }
        ListNode head=new ListNode(0);
        int sum=0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()) sum+=s1.pop().val;
            if(!s2.isEmpty()) sum+=s2.pop().val;
            ListNode node=new ListNode(sum%10);
            node.next=head.next;
            head.next=node;
            sum=sum/10;
        }
        if(sum>0){
            head.val=sum;
            return head;
        }
        return head.next;
    }
}