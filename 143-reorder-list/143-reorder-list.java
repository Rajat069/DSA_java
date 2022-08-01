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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> ar = new ArrayList<>();
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        int j = ar.size()-1;
        int i =0;
        int p = 0;
        ListNode cur = head;
        while(cur!=null){
             if(p++%2==0)cur.val = ar.get(i++);
             else cur.val=ar.get(j--);
             cur=cur.next;
        } 
    }
}