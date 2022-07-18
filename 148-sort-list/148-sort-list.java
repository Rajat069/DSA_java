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
    public ListNode sortList(ListNode head) {
         if(head==null||head.next==null){
             return head;
         }
         ListNode slow = head;
         ListNode fast = head;
         while(fast.next!=null&&fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
        ListNode temp  = slow.next;
        slow.next=null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(temp);
        ListNode ans = mergeTwoLists(l1,l2);
        return ans;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyhead  = new ListNode(0);
        ListNode anshead = dummyhead;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                anshead.next = l2;
                l2=l2.next;
            }
            else{
                 anshead.next = l1;
                 l1=l1.next;
            }
          anshead=anshead.next;  
        }
        anshead.next = l1!=null?l1:l2;
        return dummyhead.next;
    }
}