class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int idx=0;
        for(int i:nums){
            if(hm.containsKey(i)){
                int dis = Math.abs(hm.get(i)-idx);
                hm.put(i,dis);
                if(dis<=k)return true;
            }
            else hm.put(i,idx);
            idx++;
        }
        return false;
    }
}