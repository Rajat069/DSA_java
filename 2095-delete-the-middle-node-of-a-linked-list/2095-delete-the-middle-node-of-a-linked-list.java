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
    public ListNode deleteMiddle(ListNode head) {
         ListNode pre = head;
         ListNode cur = head;
         ListNode temp = head;
        int count =0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        if(count==1){
            head=null;
            return head;
        } 
        int mid =count%2==1?count-count/2-1:count-count/2;
        for(int i=0;i<mid;i++){
            if(i==(mid-1)){
               pre=cur;
            }
            cur=cur.next;
        }
        pre.next=cur.next;
        return head;
    }
}