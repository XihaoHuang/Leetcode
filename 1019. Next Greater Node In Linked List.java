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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        ListNode c=head;
        int index=0;
        while(c!=null){
            list.add(index,c.val);
            while(!stack.isEmpty() && list.get(stack.peek())<c.val){
                list.set(stack.pop(),c.val);
            }
            c=c.next;
            stack.push(index);
            index++;
        }
        while(!stack.isEmpty()){
            list.set(stack.pop(),0);
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}