class LUPrefix {
    int size;
    TreeSet<Integer>tmap = new TreeSet<>();
    public LUPrefix(int n) {
        for(int i=1;i<=n;i++){
            tmap.add(i);
        }
        size=n;
    }
    
    public void upload(int video) {
        tmap.remove(video);
    }
    
    public int longest() {
        return tmap.isEmpty()?size:tmap.first()-1;
    }
}


/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */