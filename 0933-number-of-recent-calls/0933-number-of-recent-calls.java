class RecentCounter {
    ArrayList<Integer> time = new ArrayList<>();
    int ping;
    public RecentCounter() {
        ping=0;
    }
    
    public int ping(int t) {
        int count=0;
        time.add(t);
        for(int i=time.size()-1;i>=0&&time.get(i)>=t-3000;i--){
            count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */