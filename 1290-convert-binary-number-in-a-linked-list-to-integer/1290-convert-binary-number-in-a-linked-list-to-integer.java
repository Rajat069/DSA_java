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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> ar = new ArrayList<>();
        while(head!=null){
            ar.add(head.val);
            head=head.next;
        }
        int j = ar.size()-1;
        int ans =0;
        while(j>=0){
            ans+=ar.get(j)*Math.pow(2,ar.size()-j---1);
        }
        return ans;
    }
}