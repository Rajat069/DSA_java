class Solution {
    public int[][] merge(int[][] intervals) {
          Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
          int start=intervals[0][0];
          int end=intervals[0][1];
          int p=1;
          ArrayList<int[]>ar=new ArrayList<>();
          while(p<intervals.length){
               int s=intervals[p][0];
               int e=intervals[p][1];
               if(end>=s){
                   end=Math.max(e,end);
               }
              else{
                  ar.add(new int[]{start,end});
                  start=s;
                  end=e;
              }
              p++;
          }
          ar.add(new int[]{start,end});
        return ar.toArray(new int[ar.size()][2]);
    }
}