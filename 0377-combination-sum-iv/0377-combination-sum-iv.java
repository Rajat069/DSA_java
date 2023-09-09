class Solution {
    public int combinationSum4(int[] nums, int target) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(0,1);
        return CombinationHelper(nums, target,memo);
    }
    private int CombinationHelper(int[] nums, int target,HashMap<Integer, Integer>memo) {
        if (target == 0) {
            return 1;
        }
        if (target < 0)
            return 0;
        if (memo.containsKey(target)) {
            return memo.get(target);
        }
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            count+=CombinationHelper(nums,target-nums[i],memo);
        }
        memo.put(target,count);
        return memo.get(target);
    }
}
