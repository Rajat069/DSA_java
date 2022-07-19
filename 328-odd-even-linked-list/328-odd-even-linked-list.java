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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode o = odd;
        ListNode even = head.next;
        ListNode e = even;
        ListNode temp = head.next.next;
        int count = 1;
        while(temp!=null){
            if((count&1)==1){
                odd.next = temp;
                odd=odd.next;
            }
            else {
                even.next = temp;
                even=even.next;
            }
            temp=temp.next;
            count++;
        }
        if(count%2==1){
            odd.next=null;
        }
        else {
            even.next=null;
        }
        odd.next=e;
        return o;
    }
}