class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int idx=0;
        for(int i:nums){
            hm.put(i,idx);
            idx++;
        }
        for(int i=0;i<nums.length-1;i++){
            Integer pos = hm.get(target-nums[i]);
            if(pos!=null&&pos!=i)return new int[]{i,pos};
        }
        return new int[]{-1,-1};
    }
}