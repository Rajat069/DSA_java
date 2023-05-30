class MyHashSet {
    ArrayList<Integer>ar;
    public MyHashSet() {
        ar=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!ar.contains(key))ar.add(key);
    }
    
    public void remove(int key) {
        if(ar.contains(key))ar.remove(Integer.valueOf(key));
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