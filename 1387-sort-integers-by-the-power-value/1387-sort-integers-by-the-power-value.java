class Solution {
    int[] dp = new int[10000000];
    public int getKth(int lo, int hi, int k) {
        Integer[] ar = new Integer[hi-lo+1];
        int[] sol = new int[hi-lo+1];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int idx=0;
        for(int i=lo;i<=hi;i++){
            ar[i-lo]=Integer.valueOf(i);
            sol[idx++]=power(i);
            hm.put(i,sol[idx-1]);
        }
        Arrays.sort(ar,(a,b)->{
            return hm.get(a)-hm.get(b);
        });
        return ar[k-1];
    }
    public int power(int n){
         if(n==1)return 0;
         if(dp[n]!=0)return dp[n];
         int oc=0,ev=0;
         if(n%2==1){
             oc=1+power(n*3+1);
         }
         if(n%2==0){
             ev=1+power(n/2);
         }
         dp[n]=ev+oc;
         return dp[n];
    }
}