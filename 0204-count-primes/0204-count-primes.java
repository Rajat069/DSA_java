class Solution {
    public int countPrimes(int n) {
        boolean ar[] = new boolean[n];
        Arrays.fill(ar,true);
        int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(ar[i])
            {
                for(int j=i*2;j<n;j+=i)
                {
                    ar[j]=false;
        
                }
            }

        }
        for(int i=2;i<ar.length;i++){
            if(ar[i])count++;
        }
        return count;
    }
}