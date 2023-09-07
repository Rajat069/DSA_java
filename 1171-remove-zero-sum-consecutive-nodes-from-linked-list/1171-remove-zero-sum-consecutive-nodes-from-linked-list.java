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
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer>ar = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            ar.add(temp.val);
            temp=temp.next;
        }
        boolean remove[] = new boolean[ar.size()];
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int cur=0;
        for(int i=0;i<ar.size();i++){
            cur+=ar.get(i);
            if(hm.containsKey(cur)&&(hm.get(cur)==-1?true:!remove[hm.get(cur)])){
                int pre=hm.get(cur);
                for(int j=pre+1;j<=i;j++){
                    remove[j]=true;
                }
            }
            else hm.put(cur,i);
        }
        ListNode sol = new ListNode(-1);
        ListNode t =sol;
        int idx=0;
        while(idx<remove.length){
            if(!remove[idx]&&ar.get(idx)!=0){
                ListNode newN = new ListNode(ar.get(idx));
                t.next=newN;
                t=t.next;
            }
            idx++;
        }
        return sol.next;
    }
}