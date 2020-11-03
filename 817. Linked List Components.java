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
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set=new HashSet<>();
        for(int i:G) 
            set.add(i);
        int count=0;
        ListNode c=head;
        boolean cur=false;
        while(c!=null){
            if(set.contains(c.val)){
                cur=true;
                set.remove(c.val);
            }else{
                if(cur){
                    count++;
                    cur=false;
                }
            }
                c=c.next;
        }
        if(cur) count++;
        return count;
    }
}