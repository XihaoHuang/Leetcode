/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        for(int i=1;i<lists.length;i++){
         lists[0]= compare(lists[0],lists[i]);
     
        }
        return lists[0];
    }
    public ListNode compare(ListNode l,ListNode list){
        ListNode c=new ListNode(-100);
        ListNode l1=c;
        while(l!=null && list!=null){
            if(l.val<list.val){
                c.next=l;
                l=l.next;
            }
            else{
                c.next=list;
                list=list.next;
            }
            c=c.next;
        }
            if(l!=null)    c.next=l;
            if(list!=null) c.next=list;
        l=l1.next;
        return l;
    }
}