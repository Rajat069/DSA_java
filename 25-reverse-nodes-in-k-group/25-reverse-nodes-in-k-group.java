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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummynode = new ListNode(-1);
        ListNode ansnode = dummynode;
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int rev = count/k;
        ListNode cur = null;
        ListNode p = head;
        while(rev-->0){
            int inner = k;
            ListNode pre = null;
            cur = p;
            while(inner-->0){
            ListNode point= cur.next;
            cur.next=pre;
            pre=cur;
            cur=point;
            }
            ansnode.next=pre;
            ansnode=p;
            p=cur;
        } 
        if(count%k!=0){
            ansnode.next = cur;
         }
        return dummynode.next;
    }
}