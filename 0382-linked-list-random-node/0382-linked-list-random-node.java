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
    ArrayList<ListNode>ar = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            ar.add(temp);
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        Random r = new Random();
        return ar.get(r.nextInt(ar.size())).val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */