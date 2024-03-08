class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int maxF=0,sol=0;
        for(int i:hm.keySet()){
            maxF=Math.max(maxF,hm.get(i));
        }
        for(int i:hm.keySet()){
            if(maxF==hm.get(i)){
                sol+=maxF;
            }
        }
        return sol;
    }
}