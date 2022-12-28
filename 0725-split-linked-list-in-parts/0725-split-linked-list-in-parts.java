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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode dummy = head;
        while(dummy!=null){
            size++;
            dummy=dummy.next;
        }
        ListNode[] fnodes = new ListNode[k];
        ListNode dummy2 = head;
        int idx=0;
        int div=size/k;
        if(size<k){
            while(dummy2!=null){
                ListNode temp = dummy2;
                dummy2=dummy2.next;
                temp.next=null;
                fnodes[idx++]=temp;
            }
        }
        else{
            int firstflag=size%k;
            while(idx<k&&dummy2!=null){
            int count=firstflag>0?-1:0;
            ListNode temp=dummy2;
            ListNode t_head=dummy2;
            while(count<div-1&&temp!=null){
                temp=temp.next;
                count++;   
            }
            firstflag--;
            ListNode t=null;
            if(temp!=null){
               t=temp.next;
               temp.next=null;
           }
            dummy2=t; 
            fnodes[idx++]=t_head;   
          }
       }
        return fnodes;
    }
}