class Solution {
    public int countPrimes(int n) {
      if(n<2)
      {
       return 0;
      }
        boolean ar[] = new boolean[n];
        ar[0]=false;
        ar[1]=false;
        Arrays.fill(ar,true);
        int count=0;
        for(int i=2;i<ar.length;i++)
        {
            if(ar[i])
            {
                count++;
                for(int j=2*i;j<ar.length;j+=i)
                {
                    ar[j]=false;
        
                }
            }

        }
        return count;
    }
}