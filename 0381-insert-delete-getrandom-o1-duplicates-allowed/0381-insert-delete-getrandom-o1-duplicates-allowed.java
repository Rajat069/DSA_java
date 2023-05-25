class RandomizedCollection {
    HashMap<Integer,Integer>hm;
    Random r;
    ArrayList<Integer>ar;
    public RandomizedCollection() {
        hm=new HashMap<>();
        r= new Random();
        ar=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        boolean ins =!hm.containsKey(val);
        hm.put(val,hm.getOrDefault(val,0)+1);
        ar.add(val);
        return ins;
    }
    
    public boolean remove(int val) {
        if(hm.containsKey(val)){
            hm.put(val,hm.getOrDefault(val,0)-1);
            if(hm.get(val)==0)hm.remove(val); 
            for(int i=0;i<ar.size();i++){
                if(ar.get(i)==val)ar.remove(i);
            }
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        return ar.get(r.nextInt(ar.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */