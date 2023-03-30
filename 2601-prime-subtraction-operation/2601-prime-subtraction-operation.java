class Solution {
    ArrayList<Integer> prime = new ArrayList<>();
    public void primeArr(){
        boolean[] primes = new boolean[1000];
        Arrays.fill(primes,true);
        for(int i=2;i*i<=1000;i++)
        {
            if(primes[i])
            {
                for(int j=i*2;j<1000;j+=i)
                {
                    primes[j]=false;
        
                }
            }
        }
        for(int i=2;i<1000;i++){
            if(primes[i])prime.add(i);
        }
    }
    public int minPrime(int n){
        int min=0;
        for(int i=0;i<prime.size();i++){
            if(prime.get(i)>n)return min;
            min=prime.get(i);
        }
        return min;
    }
    public boolean primeSubOperation(int[] nums) {
        primeArr();
        int[] min = new int[nums.length];
        int prev=0;
        for(int i=0;i<nums.length;i++){
            int dif = nums[i]-prev-1;
            int min_prime=minPrime(dif);
            nums[i]-=min_prime;
            prev=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1])return false;
        }
        return true;
    }
}