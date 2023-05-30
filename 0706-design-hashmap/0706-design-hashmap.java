class MyHashMap {
    ArrayList<Pair<Integer, Integer>> ar;
    public MyHashMap() {
        ar=new ArrayList<>();
    }
    
    public void put(int key, int value) {
        int i=0;
        for(;i<ar.size();i++){
            Pair<Integer,Integer>temp = ar.get(i);
            if(temp.getKey()==key){
                 ar.set(i,new Pair<Integer,Integer>(key,value));
                 break;
            }
        }
        if(i==ar.size())ar.add(new Pair<Integer,Integer>(key,value));
    }
    
    public int get(int key) {
        int i=0;
        for(;i<ar.size();i++){
            Pair<Integer,Integer>temp = ar.get(i);
            if(temp.getKey()==key){
                 return temp.getValue();
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int i=0;
        for(;i<ar.size();i++){
            Pair<Integer,Integer>temp = ar.get(i);
            if(temp.getKey()==key){
                 ar.remove(i);
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */