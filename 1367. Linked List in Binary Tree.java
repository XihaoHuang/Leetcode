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
    public boolean isSubPath(ListNode head, TreeNode root) {
        boolean left=false,right=false;
        if(head==null) return true;
        if(root==null) return false;
        if(head.val==root.val){
            left=checknext(head.next,root.left);
            right=checknext(head.next,root.right);
        }
        if(left || right) return true;
        left=isSubPath(head,root.left);
        right=isSubPath(head,root.right);
        
        return left || right;
    }
    public static boolean checknext(ListNode head,TreeNode root){
         boolean left=false,right=false;
        if(head==null) return true;
        if(root==null) return false;
        if(head.val==root.val){
            left=checknext(head.next,root.left);
            right=checknext(head.next,root.right);
        }
        return left || right;
    }
}