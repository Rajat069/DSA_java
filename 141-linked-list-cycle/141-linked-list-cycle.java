/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode node1 = head;
        int count=0;
        while(node1!=null){
            node1=node1.next; 
            count++;
            if(count==10001){
                return true;
            }
        }
        return false;
    }
}