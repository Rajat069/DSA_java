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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre=null;
        ListNode cur=head;
        while(left>1){
            pre=cur;
            cur=cur.next;
            left--;
            right--;
        }
        ListNode fcon=pre;
        ListNode lcon=cur;
        while(right>0){
            ListNode temp = cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
            right--;
        }
        if(fcon!=null){
            fcon.next=pre;
        }
        else head=pre;
        lcon.next=cur;
        return head;
    }
}