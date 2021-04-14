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
    ListNode dummy;
    int size=0;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(head!=null){
            ListNode node=new ListNode(head.val);
            cur.next=node;
            cur=cur.next;
            head=head.next;
            size++;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        Random ran=new Random();
        int r=ran.nextInt(size);
        ListNode cur=dummy;
        while(r>0){
            cur=cur.next;
            r--;
        }
        return cur.next.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */