class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> sol = new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        int idx=0;
        for(int g:groupSizes){
            if(!hm.containsKey(g)){
                ArrayList<Integer>ar = new ArrayList<>();
                ar.add(idx);
                hm.put(g,ar);
            }
            else hm.get(g).add(idx);
            idx++;
        }
        for(int key:hm.keySet()){
            ArrayList<Integer>ar = hm.get(key);
            idx=0;
            for(int i=0;i<ar.size()/key;i++){
                List<Integer>temp = new ArrayList<>();
                for(int j=0;j<key;j++){
                    temp.add(ar.get(idx++));
                }
                sol.add(temp);
            }
        }
        return sol;
    }
}