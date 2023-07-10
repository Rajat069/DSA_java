class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0,maxsum=0;
        int l = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxsum=sum;
        for (int j = k; j < nums.length; j++) {
            sum = sum + nums[j] - nums[l];
            maxsum = Math.max(maxsum, sum);
            l++;
        }
        return (double) maxsum / k;
    }
}
