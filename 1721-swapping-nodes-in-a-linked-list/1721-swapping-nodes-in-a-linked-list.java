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
    public ListNode swapNodes(ListNode head, int k) {
          ListNode temp = head;
          int count = 1;
          ListNode idx1 = head;
          while(temp!=null){
              if(count==k){
                  idx1=temp;
                  idx1.val = temp.val;
              }
              temp=temp.next;
              count++;
          }
         ListNode idx2 = head;
         int c = 0;
         for(int i=0;i<count-k-1;i++){
             idx2=idx2.next;
         }
        int tdata = idx1.val;
        idx1.val=idx2.val;
        idx2.val = tdata;
        return head;
    }
}