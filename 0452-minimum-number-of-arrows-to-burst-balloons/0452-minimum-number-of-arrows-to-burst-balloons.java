class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points, new Comparator<int[]>() { 
          @Override              
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
            if (entry1[1] > entry2[1]) 
                return 1; 
            else
                return -1; 
          } 
        });
        int arrows=1;
        int pre=0;
        for(int i=1;i<points.length;i++){
           if(points[i][0]>points[pre][1]){
               arrows++;
               pre=i;
           }
            
        }
        return arrows;
    }
}