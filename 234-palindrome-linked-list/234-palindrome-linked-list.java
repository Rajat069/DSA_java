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
    public boolean isPalindrome(ListNode head) {
        StringBuilder org = new StringBuilder();
        ListNode temp = head;
        while(temp!=null){
            org.append(temp.val);
            temp=temp.next;
        }
        ListNode cur = head;
        ListNode pre = null;
        while(cur!=null){
            ListNode temp1 = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp1;
        }
        StringBuilder rev = new StringBuilder();
        ListNode temp2=pre;
        while(temp2!=null){
            rev.append(temp2.val);
            temp2=temp2.next;
        }
        return rev.toString().equals(org.toString());
    }
}