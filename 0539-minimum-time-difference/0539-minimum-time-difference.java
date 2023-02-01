class Solution {
    public int findMinDifference(List<String> timePoints) {
        boolean[] time_ar=new boolean[60*24];
        for(String temp:timePoints){
            String[] time=temp.split(":");
            int hour=Integer.parseInt(time[0]);
            int minutes=Integer.parseInt(time[1]);
            if(time_ar[hour*60+minutes])return 0;
            time_ar[hour*60+minutes]=true;
        }
        int ftime=-1;
        int ptime=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<1440;i++){
            if(time_ar[i]){
            if(ftime==-1){
                ftime=i;
                ptime=i;
            }
            else{
                min=Math.min(min,Math.min(i-ptime,1440-i+ptime));
                ptime=i;
            }    
          }
        }
        min=Math.min(min,Math.min(ptime-ftime,1440-(ptime-ftime)));
        return min;
    }
}