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
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] list=new ListNode[k];
        int length=0;
        ListNode c=root;
        while(c!=null){
            c=c.next;
            length++; 
        }
        c=root;
        if(length<=k){
            for(int i=0;i<length;i++){
                list[i]=new ListNode(c.val);
                c=c.next;
            }            
        }else{
            int val=length/k,r=length%k;
            for(int i=0;i<k;i++){
                list[i]=new ListNode(c.val);
                ListNode c1=list[i];
                int size=val+((r-->0)?1:0);
                for(int j=1;j<size;j++){
                    c=c.next;
                    c1.next=new ListNode(c.val);
                    c1=c1.next;
                }
                c=c.next;
            }
        }
        return list;
    }

}