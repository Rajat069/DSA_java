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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode list:lists){
            while(list!=null){
                pq.offer(list);
                list=list.next;
            }
        }
        ListNode mergedLists = new ListNode(-1);
        ListNode sol = mergedLists;
        while(!pq.isEmpty()){
            sol.next=pq.poll();
            sol=sol.next;
        }
        sol.next=null;
        return mergedLists.next;
    }
}