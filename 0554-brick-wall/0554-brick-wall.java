class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<wall.size();i++){
            int val=0;
            for(int j=0;j<wall.get(i).size()-1;j++){
                val+=wall.get(i).get(j);
                 hm.put(val,hm.getOrDefault(val,0)+1);
            }
        }
      int max=0;
      Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
      for(Map.Entry<Integer, Integer> entry : entries) {
              max=Math.max(max,entry.getValue());
      }
      
      return wall.size()-max;  
    }
}