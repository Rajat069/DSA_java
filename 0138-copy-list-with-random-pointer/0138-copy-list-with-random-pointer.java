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
        HashMap<Node,Node> hm = new HashMap<>();
        Node temp = head;
        while(temp!=null){
           hm.put(temp,new Node(temp.val));
           temp=temp.next; 
        }
        Node temp2=head;
        while(temp2!=null){
           hm.get(temp2).next=hm.get(temp2.next);
           hm.get(temp2).random=hm.get(temp2.random);
           temp2=temp2.next; 
        }
        return hm.get(head);
    }
}