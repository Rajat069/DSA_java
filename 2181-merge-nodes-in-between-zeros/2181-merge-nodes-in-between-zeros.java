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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyhead = new ListNode(-1);
        ListNode ansnode = dummyhead;
        ListNode temp = head;
        temp=temp.next;
        while(temp!=null){
            int count = 0;
            while(temp!=null&&temp.val!=0){
                count+=temp.val;
                temp=temp.next;
            }
            temp=temp.next;
            ListNode node = new ListNode(count);
            ansnode.next = node;
            ansnode=ansnode.next;
        }
        return dummyhead.next;
    }
}