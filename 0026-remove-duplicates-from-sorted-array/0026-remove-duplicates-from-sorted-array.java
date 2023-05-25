class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer,Integer>hs = new TreeMap<>();
        for(int i:nums){
            hs.put(i,-1);
        }
        int idx=0;
        Set<Integer>elem=hs.keySet();
        for(int i:elem){
            nums[idx++]=i;
        }
        return hs.size();
    }
}