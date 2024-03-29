class MyHashSet {
    ArrayList<Integer>ar;
    public MyHashSet() {
        ar=new ArrayList<>();
    }
    public void add(int key) {
        ar.add(key);
    }
    public void remove(int key) {     
        Iterator itr = ar.iterator();
        while(itr.hasNext()){
            int x=(int)itr.next();
            if(x==key)itr.remove();
        }
    }
    public boolean contains(int key) {
        return ar.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */