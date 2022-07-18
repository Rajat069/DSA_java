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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode dummyhead  = new ListNode(0);
        ListNode anshead = dummyhead;
        while(l1!=null&&l2!=null){
            if(l1.val>l2.val){
                anshead.next = l2;
                l2=l2.next;
            }
            else if(l1.val==l2.val){
                 anshead.next = l1;
                 l1=l1.next;
                 anshead=anshead.next;
                 anshead.next = l2;
                 l2=l2.next;
            }
            else{
                 anshead.next = l1;
                 l1=l1.next;
            }
          anshead=anshead.next;  
        }
        while(l1!=null){
            anshead.next=l1;
            l1=l1.next;
            anshead=anshead.next;
        }
        while(l2!=null){
            anshead.next=l2;
            l2=l2.next;
            anshead=anshead.next;
        }
        return dummyhead.next;
    }
}