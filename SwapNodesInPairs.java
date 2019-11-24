class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode c=head;
        while(c!=null && c.next!=null){
        int k=c.val;
        c.val=c.next.val;
        c.next.val=k;
        c=c.next.next;
    }

        return head;
    }
}