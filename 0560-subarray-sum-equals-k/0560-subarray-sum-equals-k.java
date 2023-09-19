class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==1)return nums[0]==k?1:0;
        int count=0,cur=0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            if(hm.containsKey(cur-k)){
                count+=hm.get(cur-k);
            }
            hm.put(cur,hm.getOrDefault(cur,0)+1);
        }
        return count;
    }
}