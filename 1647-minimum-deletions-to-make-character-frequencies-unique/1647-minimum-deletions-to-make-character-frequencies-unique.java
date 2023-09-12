class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        HashSet<Integer>hs = new HashSet<>();
        ArrayList<Integer>val = new ArrayList<>();
        for(int i:hm.values()){
            val.add(i);
        }
        int minDel=0;
        Collections.sort(val,Collections.reverseOrder());
        for(int v:val){
            int vv=v;
            while(vv>0&&hs.contains(vv)){
                vv--;
                minDel++;
            }
            hs.add(vv);
        }
        return minDel;
    }
}