class MyLinkedList {
    class node{
        int val;
        node next;
        node(int val){
            this.val=val;
            next=null;
        }
    }
    node head = null;
    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        node temp=head;
        for(int i=0;temp!=null;i++){
            if(index==i)return temp.val;
            temp=temp.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        node new_node = new node(val);
        if(head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    
    public void addAtTail(int val) {
        node new_node = new node(val);
        if(head==null){
            head=new_node;
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }
    
    public void addAtIndex(int index, int val) {
        node new_node = new node(val),temp=head;
        if(index==0){
            addAtHead(val);
            return;
        }
        int idx=0;
        while(temp!=null&&idx<index-1){
            temp=temp.next;
            idx++;
        }
        if(temp==null)return;
        node nextn = temp.next;
        temp.next=new_node;
        new_node.next=nextn;
    }
    
   public void deleteAtIndex(int index) {
    if (head == null || index == 0) {
        head = head.next;
        return;
    }
    
    int idx = 0;
    node temp = head;
    while (idx < index - 1 && temp != null) {
        temp = temp.next;
        idx++;
    }
    
    if (temp == null || temp.next == null) {
        return;
    }
    
    temp.next = temp.next.next;
 }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */