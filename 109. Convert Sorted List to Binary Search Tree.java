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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        return BST(head,null);
    }
    public static TreeNode BST(ListNode head,ListNode tail){
        ListNode first=head;
        ListNode second=head;
        if(head==tail) return null;
        while(second!=tail && second.next!=tail){
            first=first.next;
            second=second.next.next;
        }
        TreeNode Thead=new TreeNode(first.val);
        Thead.left=BST(head,first);
        Thead.right=BST(first.next,tail);
        return Thead;
    }
}