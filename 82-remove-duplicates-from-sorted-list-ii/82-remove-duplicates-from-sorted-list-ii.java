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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummynode = new ListNode(-1);
        ListNode ansnode = dummynode;
        ListNode temp = head;
        while(temp!=null){
           int count = 0; 
           while(temp.next!=null&&temp.val==temp.next.val){
               temp=temp.next;
               count++;
           }
           if(count==0){
               ansnode.next=temp;
               ansnode=ansnode.next;
           } 
           temp=temp.next;
        }
        ansnode.next=null;
        return dummynode.next;
    }
}