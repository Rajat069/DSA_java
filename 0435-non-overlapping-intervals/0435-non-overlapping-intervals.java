class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int l=0,r=1,count=0;
        while(r<intervals.length){
            if(intervals[l][1]<=intervals[r][0]){
                l=r;
            }
            else if(intervals[l][1]<=intervals[r][1]){
                count++;
            }
            else if(intervals[l][1]>intervals[r][1]){
                l=r;
                count++;
            }
            r++;
        }
        return count;
    }
}