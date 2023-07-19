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
          int[][] sol = new int[ar.size()][2];
          p=0;
          while(p<ar.size()){
              int[] temp = new int[2];
              temp[0]=ar.get(p)[0];
              temp[1]=ar.get(p)[1];
              sol[p]=temp;
              p++;
          }
        return sol;
    }
}