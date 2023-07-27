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
        int p1=0,p2=org.length()-1;
        while(p1<p2){
            if(org.charAt(p1)!=org.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}