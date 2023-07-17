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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ArrayList<Integer>ar1 = new ArrayList<>();
         ArrayList<Integer>ar2 = new ArrayList<>();
         ListNode temp = l1;
         while(temp!=null){
             ar1.add(temp.val);
             temp=temp.next;
         }
         temp = l2;
         while(temp!=null){
             ar2.add(temp.val);
             temp=temp.next;
         }
         int carry=0;
         ArrayList<Integer>sol = new ArrayList<>();
         int i=ar1.size()-1,j=ar2.size()-1;
         while(i>=0&&j>=0){
             int sum = ar1.get(i--)+ar2.get(j--)+carry;
             carry=sum/10;
             sol.add(sum%10);
         }
         while(i>=0){
             int sum = ar1.get(i--)+carry;
             carry=sum/10;
             sol.add(sum%10);
         }
         if(carry!=0&&j<0){
           sol.add(carry);
           carry=0;  
         }
         while(j>=0){
             int sum = ar2.get(j--)+carry;
             carry=sum/10;
             sol.add(sum%10);
         }
        if(carry!=0){
           sol.add(carry);
           carry=0;  
        }
        temp = new ListNode(-1);
        ListNode sumL=temp;
        int p=sol.size()-1;
        while(p>=0){
            ListNode dig = new ListNode(sol.get(p));
            temp.next=dig;
            temp=temp.next;
            p--;
        }
        return sumL.next;
    }
}