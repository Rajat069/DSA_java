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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode f1 = list1;
        ListNode f2 = list1;
        ListNode temp = list1;
        for(int i=0;i<=b;i++){
            if(i==a-1){
                f1 = temp;
            }
            temp=temp.next;
        }
        f2=temp;
        f1.next=list2;
        ListNode temp2=list2;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=f2;
        return list1;
    }
}