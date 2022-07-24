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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummyhead = new ListNode(-1);
        ListNode ansnode = dummyhead;
        ListNode temp = head;
        while(temp!=null&&temp.next!=null){
            ListNode n1 = temp;
            ListNode next = temp.next.next;
            ListNode n2 = temp.next;
            ansnode.next=n2;
            n2.next=n1;
            n1.next=next;
            temp=next;
            ansnode=ansnode.next.next;
        }
        return dummyhead.next;
    }
}