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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        ListNode cur = head;
        ListNode pre = head;
        while(cur!=null){
            if(cur.val==val){
                 pre.next = cur.next;           
            }
            else {
                 pre=cur;
                 pre.next=cur.next;
            }
            cur=cur.next;
        }
        return head;
    }
}