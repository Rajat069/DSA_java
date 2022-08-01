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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummynode = new ListNode(-1);
        ListNode ansnode = dummynode;
        ListNode temp = head;
        ArrayList<Integer> ar = new ArrayList<>();
        while(temp!=null){
            if(!ar.contains(temp.val)){
                ansnode.next = temp;
                ansnode=ansnode.next;
                ar.add(temp.val);
            }
           temp=temp.next;
        }
        ansnode.next=null;
        return dummynode.next;
    }
}