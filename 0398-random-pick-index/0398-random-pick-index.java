class Solution {
    HashMap<Integer,ArrayList<Integer>> hm;
    public Solution(int[] nums) {
        hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.get(nums[i]).add(i);
            }
            else{
                ArrayList<Integer>ar=new ArrayList<>();
                ar.add(i);
                hm.put(nums[i],ar);
            }
        }
    }
    
    public int pick(int target) {
        ArrayList<Integer>ar = hm.get(target);
        Random rd = new Random();
        return ar.get(rd.nextInt(ar.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */