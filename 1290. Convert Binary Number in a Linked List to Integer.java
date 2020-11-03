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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode c=head;
        while(c!=null){
            stack.push(c.val);
            c=c.next;
        }
        int sum=0;
        int exp=0;
        while(!stack.isEmpty()){
            sum+=stack.pop()*Math.pow(2,exp);
            exp++;
        }
        return sum;
    }
}