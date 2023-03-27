class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        List<Long>ar = new ArrayList<>();
        Arrays.sort(nums);
        long[] prefix = new long[nums.length];
        int i=0;
        long sum=0;
        for(int num:nums){
            sum+=num;
            prefix[i++]=sum;
        }
        for(int q:queries){
            int left = 0;
            int right = nums.length - 1;
            int idx = nums.length;
            while (left <= right) {
               int mid = (left + right) / 2;
               if (nums[mid] > q) {
                 idx = mid;
                 right = mid - 1;
                } else {
                 left = mid + 1;
                }
            }
           long sol_l = idx != 0 ? ((long) q * (long) idx) - prefix[idx - 1] : 0L;
long sol_r = (long) prefix[nums.length - 1] - (idx != 0 ? prefix[idx - 1] : 0L) - ((long) nums.length - (long) idx) * (long) q;
          long val = sol_l + sol_r;
          ar.add(val);

        }
        return ar;
    }
}