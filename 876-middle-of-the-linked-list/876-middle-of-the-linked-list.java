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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        int mid = count/2+1;
        ListNode ans = head;
        while(mid-->1){
            ans=ans.next;
        }
        return ans;
    }
}