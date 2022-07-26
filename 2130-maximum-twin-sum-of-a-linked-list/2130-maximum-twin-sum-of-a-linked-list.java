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
    public int pairSum(ListNode head) {
        ArrayList<Integer> ar = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        int j = ar.size()-1;
        int maxtwin = Integer.MIN_VALUE;
        int i =0;
        ListNode node = head;
        while(i<ar.size()/2){
            maxtwin=Math.max(maxtwin,node.val+ar.get(j--));
            i++;
            node = node.next;
        }
        return maxtwin;
    }
}