class AuthenticationManager {
    int TTL;
    LinkedHashMap<String,Integer>hm = new LinkedHashMap<>();
    public AuthenticationManager(int timeToLive) {
        this.TTL=timeToLive;
    }
    
    public void generate(String tokenId, int currentTime) {
        clean(currentTime);
        hm.put(tokenId,currentTime+TTL);
    }
    
    public void renew(String tokenId, int currentTime) {
        clean(currentTime);
        if(hm.containsKey(tokenId)){
            hm.remove(tokenId);
            hm.put(tokenId,currentTime+TTL);
        }
    }
    
    public int countUnexpiredTokens(int currentTime) {
        clean(currentTime);
        return hm.size();
    }
    private void clean(int time){
         for(Iterator<String> it = hm.keySet().iterator(); it.hasNext(); ) {
            String key = it.next();
            if(hm.get(key) <= time) {
                it.remove();
            }else{
                break;
            }
        }
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */