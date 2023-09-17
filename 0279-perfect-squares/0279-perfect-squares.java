class Solution {
    public int numSquares(int n) {
        ArrayList<Integer>ar = new ArrayList<>();
        int num=1; 
        while(num*num<=n){
            ar.add(num*num);
            num++;
        }
        int[]dp = new int[n+1];
        return helper(ar,n,dp);
    }
    private int helper(ArrayList<Integer>ar,int num,int[]dp){
        if(num==0){
              return 0; 
        }
        int count=Integer.MAX_VALUE;
        for(int i=0;i<ar.size();i++){
            if(num-ar.get(i)>=0){
                int sub=0;
                if(dp[num-ar.get(i)]!=0){
                    sub=dp[num-ar.get(i)];
                }
                else sub=helper(ar,num-ar.get(i),dp);
                if(sub!=Integer.MAX_VALUE&&sub+1<count){
                    count=sub+1;
                }
            }
        }
        return dp[num]=count;
    }
}