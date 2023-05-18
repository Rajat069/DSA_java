/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Node> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node temp = queue.poll();
                level.add(temp);
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
            for(int i=1;i<level.size();i++){
                   level.get(i-1).next=level.get(i);
                }
              level.get(level.size()-1).next=null;
          
        }
        return root;
    }
}