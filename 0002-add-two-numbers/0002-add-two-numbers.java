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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ListNode temp1=l1,temp2=l2;
        while(temp1!=null){
            sb1.append(temp1.val);
            temp1=temp1.next;
        }
        while(temp2!=null){
            sb2.append(temp2.val);
            temp2=temp2.next;
        }
        sb1.reverse();
        sb2.reverse();
        BigInteger num1 = new BigInteger(sb1.toString());
        BigInteger num2 = new BigInteger(sb2.toString());
        BigInteger sum = num1.add(num2);
        StringBuilder rev = new StringBuilder(sum.toString());
        rev.reverse();
        String fnum = rev.toString();
        ListNode sol=new ListNode(-1);
        ListNode temp=sol;
        int idx=0;
        while(idx<fnum.length()){
            ListNode num = new ListNode(fnum.charAt(idx)-'0');
            temp.next=num;
            temp=temp.next;
            idx++;
        }
        return sol.next;
    }
}