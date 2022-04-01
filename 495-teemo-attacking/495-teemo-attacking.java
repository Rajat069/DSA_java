class Solution {
    public int findPoisonedDuration(int[] time, int dur) {
        int sec =0;
        for(int i=1;i<time.length;i++){
            sec+=Math.min(time[i]-time[i-1],dur); 
        }
        sec+=dur;
        return sec;
    }
}