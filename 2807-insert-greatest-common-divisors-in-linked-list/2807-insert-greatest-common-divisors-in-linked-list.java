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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p=head,sol=head;
        while(p!=null&&p.next!=null){
            int g=gcd(p.val,p.next.val);
            ListNode hcf=new ListNode(g);
            ListNode nxt=p.next;
            p.next=hcf;
            hcf.next=nxt;
            p=nxt;
        }
        return sol;
    }
    public int gcd(int num1,int num2){
        if(num1==0)return num2;
        return gcd(num2%num1,num1);
    }
}