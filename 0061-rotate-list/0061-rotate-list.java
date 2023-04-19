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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)return head;
        int size=0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        k%=size;
        if(k==0)return head;
        int b=size-k;
        ListNode dummyhead= new ListNode(-1);
        ListNode temp1 =head,prev = head;
        while(b>0){
            if(b==1)prev=temp1;
            temp1=temp1.next;
            b--;
        }
        dummyhead.next=temp1;
        prev.next=null;
        while(temp1.next!=null)temp1=temp1.next;
        temp1.next=head;
        
        return dummyhead.next;
    }
}