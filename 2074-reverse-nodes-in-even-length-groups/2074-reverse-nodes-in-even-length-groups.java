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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode temp = head;
        ListNode dummyhead = new ListNode(-1);
        ListNode ansnode = dummyhead;
        int i = 1;
        while(temp!=null){
            if(i%2==0){
                ListNode ansf = ansnode;
                ListNode first = temp;
                ListNode cur = temp;
                ListNode pre = null;
                int rev = i;
                int count =0;
                while(rev-->0&&cur!=null){
                    ListNode nxt = cur.next;
                    cur.next=pre;
                    pre=cur;
                    cur=nxt;
                    count++;
                }
                ansnode.next = pre;
                ansnode=temp;
                temp=cur;
                if(count%2==1){
                ListNode cur1 = pre;
                ListNode pre1 = null;
                int rev1 = count;
                while(rev1-->0&&cur1!=null){
                    ListNode nxt = cur1.next;
                    cur1.next=pre1;
                    pre1=cur1;
                    cur1=nxt;
                }
                ansf.next = pre1;
                ansf=first;
                temp=cur1;
                }
            }
            else{
                int count =0;
                ListNode start = temp;
                ListNode tempans = ansnode;
                ansnode.next=temp;
                for(int j=0;j<i&&temp!=null;j++){
                    ansnode=ansnode.next;
                    temp=temp.next;
                    count++;
                }
                if(count%2==0){
                ListNode cur = start;
                ListNode pre = null;
                int rev = count;
                while(rev-->0){
                    ListNode nxt = cur.next;
                    cur.next=pre;
                    pre=cur;
                    cur=nxt;
                }
                tempans.next = pre;
                ansnode=start;
                temp=cur;
                }
            }
            i++;
        }
        return dummyhead.next;
    }
}