class Solution {
    public int numTimesAllBlue(int[] flips) {
        long curSum = 0;
        long sol = 0;
        for (int i = 0; i < flips.length; i++) {
            curSum += flips[i];
            long expectedSum = ((long) (i + 1) * (i + 2)) / 2; //sum of n natural no 
            if (curSum == expectedSum) {
                sol++;
            }
        }
        return (int) sol; 
    }
}
