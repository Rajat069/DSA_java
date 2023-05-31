class UndergroundSystem {
    HashMap<Integer,Pair<String,Integer>>hm;
    HashMap<String,ArrayList<Integer>>avg;
    public UndergroundSystem() {
        hm=new HashMap<>();
        avg=new HashMap<>();    
    }
    
    public void checkIn(int id, String stationName, int t) {
        Pair<String,Integer>Ckin= new Pair<String,Integer>(stationName,t); 
        hm.put(id,Ckin);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String,Integer>Ckout=hm.get(id);
        StringBuilder path = new StringBuilder(Ckout.getKey());
        path.append("to:"+stationName);
        int timeT=t-Ckout.getValue();
        if(avg.containsKey(path.toString())){
            avg.get(path.toString()).add(timeT);
        }
        else{
            ArrayList<Integer>ar = new ArrayList<>();
            ar.add(t-Ckout.getValue());
            avg.put(path.toString(),ar);
        }
        hm.remove(id);
      
    }
    
    public double getAverageTime(String startStation, String endStation) {
        double sol=0;
        StringBuilder path = new StringBuilder(startStation);
        path.append("to:"+endStation);
        ArrayList<Integer>av = avg.get(path.toString());
        for(int i:av){
            sol+=i;
        }
        return sol/av.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */