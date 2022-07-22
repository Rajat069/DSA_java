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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dig1 = l1;
        ListNode dig2 = l2;
        ListNode ansdig = new ListNode(0);
        ListNode pointer = ansdig;
        int carry = 0;
        while(dig1!=null||dig2!=null||carry!=0){
            if(dig1!=null){
                carry+=dig1.val;
                dig1=dig1.next;
            }
            if(dig2!=null){
                carry+=dig2.val;
                dig2=dig2.next;
            }
            if(carry>9){
                ListNode temp = new ListNode(carry%10);
                pointer.next=temp;
                carry/=10;
            }
            else {
                ListNode temp = new ListNode(carry);
                pointer.next=temp;
                carry=0;
            }
            pointer=pointer.next;
        }
        return ansdig.next;
    }
   
}