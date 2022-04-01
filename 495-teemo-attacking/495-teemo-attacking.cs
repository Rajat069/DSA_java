public class Solution {
    public int FindPoisonedDuration(int[] time, int dur) {
        int sec =0;
        for(int i=0;i<time.Length-1;i++){
            if(time[i]+dur<=time[i+1])sec+=dur;
            else sec+=time[i+1]-time[i];
        }
        sec+=dur;
        return sec;
    }
}