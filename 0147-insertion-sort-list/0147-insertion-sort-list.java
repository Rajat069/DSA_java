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
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)return head;
        ArrayList<ListNode>ar = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ar.add(temp);
            temp=temp.next;
        }
        Collections.sort(ar,(a,b)->(a.val-b.val));
        ListNode dummy = new ListNode(-1);
        ListNode sol=dummy;
        int idx=0;
        while(idx<ar.size()){
            sol.next=ar.get(idx);
            sol=sol.next;
            idx++;
        }
        sol.next=null;
        return dummy.next;
    }
}