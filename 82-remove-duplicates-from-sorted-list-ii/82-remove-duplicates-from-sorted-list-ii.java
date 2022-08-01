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
        ListNode temp = head;
        ArrayList<Integer> ar = new ArrayList<>();
        while(temp!=null){
           int count = 0; 
           while(temp.next!=null&&temp.val==temp.next.val){
               temp=temp.next;
               count++;
           }
           if(count==0){
               ar.add(temp.val);
           } 
           temp=temp.next;
        }
        Collections.sort(ar);
        ListNode dummynode = new ListNode(-1);
        ListNode ansnode = dummynode;
        int i=0;
        while(i<ar.size()){
            ansnode.next= new ListNode(ar.get(i++));
            ansnode=ansnode.next;
        }
        return dummynode.next;
    }
}