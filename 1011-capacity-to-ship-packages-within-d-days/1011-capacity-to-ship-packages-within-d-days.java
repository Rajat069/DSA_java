class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0,low=0;
        for(int i:weights){
            high+=i;
            low=Math.max(i,low);
        }
        int final_ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid = (high+low)/2;
            int day=1;
            int sum=0;
            for(int i=0;i<weights.length;i++){
                if(sum+weights[i]<=mid){
                    sum+=weights[i];
                }
                else{
                    sum=weights[i];
                    day++;
                }
            }
            if(day<=days){
                final_ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return final_ans;
    }
}