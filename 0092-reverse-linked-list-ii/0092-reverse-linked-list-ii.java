class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null||left == right){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        int idx=1;
        while(idx<left){
            prev=prev.next;
            idx++;
        }
        ListNode cur=prev.next;
        ListNode next=cur.next;
        for (int i=left;i<right;i++){
            cur.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = cur.next;
        }
        return dummy.next;
    }
}
