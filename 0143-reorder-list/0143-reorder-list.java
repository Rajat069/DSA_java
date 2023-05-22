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
    public void reorderList(ListNode head) {
        if(head.next==null)return;
        ListNode l1=head,fast=head.next,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode s=slow.next;
        slow.next=null;
        s=rev(s);
        merge(l1,s);
    }
    void merge(ListNode head1, ListNode head2) {
        while (head2 != null) {
            ListNode next = head1.next;
            head1.next = head2;
            head1 = head2;
            head2 = next;
        }
    }
    public ListNode rev(ListNode node){
        ListNode prev=null,cur=node;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
}