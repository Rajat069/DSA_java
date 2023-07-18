class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;
        Node(int key){
            this.key=key;
        }
    }
    int cap;
    HashMap<Integer,Node> hm;
    Node head=new Node(-1),tail= new Node(-1);
    public LRUCache(int capacity) {
        hm=new HashMap<>(capacity);
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node newNode= hm.get(key);
            deleteNode(newNode);
            addNode(newNode);
            return newNode.value;
        }
        else return -1;
    }
    
    public void put(int key, int value) {
        Node newNode = hm.get(key);
        if(newNode==null){
            if(cap==hm.size()){
                hm.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
            newNode= new Node(key);
            newNode.value=value;
            addNode(newNode);
            hm.put(key,newNode);
        }
        else{
            deleteNode(newNode);
            newNode.value=value;
            addNode(newNode);
        }
    }
    public void addNode(Node node){
        Node nextt=head.next;
        node.next=nextt;
        nextt.prev=node;
        head.next=node;
        node.prev=head;
    }
    public void deleteNode(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */