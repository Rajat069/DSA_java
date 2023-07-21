class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for(int log[]:logs){
            int syear=log[0]-1950;
            int eyear=log[1]-1950;
            years[syear]++;
            years[eyear]--;
        }
        int ans=2051,maxPop=years[0];
        for(int i=0;i<years.length;i++){
            if(i!=0)years[i]+=years[i-1];
            if(years[i]>=maxPop){
                if(years[i]==maxPop){
                    ans=Math.min(1950+i,ans);
                }
                else ans=1950+i;
                maxPop=years[i];
            }
        }
        return ans;
    }
}