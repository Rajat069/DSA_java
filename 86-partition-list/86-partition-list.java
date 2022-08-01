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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode Dummyhead = new ListNode(-1);
        ListNode ansnode = Dummyhead;
        ListNode greaterx = null;
        ListNode lessx = null;
        ListNode firstbig = null;
        while(temp!=null){
            if(temp.val>=x){
               if(greaterx==null){
                   greaterx=temp;
                   firstbig = temp;
               }
               else{
                   greaterx.next = temp;
                   greaterx=greaterx.next;
               }

            }
            else if(temp.val<x){
                if(lessx==null){
                    ansnode.next = temp;
                    lessx=temp;
                }
                else{
                    lessx.next = temp;
                    lessx=lessx.next;
                }
            }
            temp=temp.next;
        }
        if(greaterx==null&&lessx==null){
            return null;
        }
        else if(greaterx==null){
            lessx.next=null;
        }
        else if(lessx==null) {
            ansnode.next=firstbig;
            greaterx.next = null;
        }
        else {
            lessx.next=firstbig;
            greaterx.next = null;
        }
        return ansnode.next;
    }
}