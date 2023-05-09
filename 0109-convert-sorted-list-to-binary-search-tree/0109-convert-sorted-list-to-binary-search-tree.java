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
    private ArrayList<Integer> ar = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        traverseNode(head);
        return makeBST(0,ar.size()-1);
        
    }
    public void traverseNode(ListNode head){
        while(head!=null){
            ar.add(head.val);
            head=head.next;
        }
    }
    public TreeNode makeBST(int left,int right){
        if(left>right){
            return null; 
        }
        int mid = left+(right-left)/2;
        TreeNode node1 = new TreeNode(ar.get(mid));
        node1.left=makeBST(left,mid-1);
        node1.right=makeBST(mid+1,right);
        return node1;
    }
}