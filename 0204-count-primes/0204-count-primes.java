class Solution {
    public int countPrimes(int n) {
      if(n<2)
      {
       return 0;
      }
        boolean ar[] = new boolean[n];
        Arrays.fill(ar,true);
        ar[0]=false;
        ar[1]=false;
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(ar[i])
            {
                for(int j=i;j*i<ar.length;j++)
                {
                    ar[j*i]=false;
        
                }
            }

        }
        for(int i=0;i<ar.length;i++){
            if(ar[i])count++;
        }
        return count;
    }
}