class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer,Integer>map = new TreeMap<>();
        for(int i:nums){
            map.put(i,0);
        }
        Set<Integer> ks = map.keySet();
        ArrayList<Integer>ar = new ArrayList<>(ks);
        int sol=0;
        for(int i=0;i<ar.size();i++){
            boolean f=false;
            int len=1;
            while(i<ar.size()-1&&ar.get(i+1)-ar.get(i)==1){
                i++;
                f=true;
                len++;
            }
            if(f)i--;
            sol=Math.max(sol,len);
        }
        return sol;
    }
}