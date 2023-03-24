class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:tasks){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int sol=0;
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                return -1;
            }
            sol+=(Math.ceil(hm.get(key)/3.0));
        }
        return sol;
    }
}