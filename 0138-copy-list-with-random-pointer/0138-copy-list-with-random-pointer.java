/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node,Node>hm = new HashMap<>();
        for(;temp!=null;temp=temp.next){
           Node newNode = new Node(temp.val);
           hm.put(temp,newNode); 
        }
        Node temp2 = head;
        while(temp2!=null){
            hm.get(temp2).next=hm.get(temp2.next);
            hm.get(temp2).random=hm.get(temp2.random);
            temp2=temp2.next;
        }
        return hm.get(head);
    }
}