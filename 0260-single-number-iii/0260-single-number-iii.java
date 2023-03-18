class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[] ans = new int[2];
        int idx=0;
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                ans[idx++]=i;
            }
        }
        return ans;
    }
}