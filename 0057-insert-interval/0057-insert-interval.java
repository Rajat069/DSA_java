class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>ar = new ArrayList<>();
        int i=0;
        while(i<intervals.length&&newInterval[0]>intervals[i][1]){
            ar.add(intervals[i]);
            i++;
        }
        while(i<intervals.length&&newInterval[1]>=intervals[i][0]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        ar.add(newInterval);
        while(i<intervals.length){
            ar.add(intervals[i]);
            i++;
        }
        int[][]sol = new int[ar.size()][2];
        i=0;
        for(int[]arr:ar){
            sol[i++]=arr;
        }
        return sol;
    }
}