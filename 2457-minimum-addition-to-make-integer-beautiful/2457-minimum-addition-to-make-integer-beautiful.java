class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if(digsum(n)<=target){
            return 0;
        }
        else{
                int d =  (int)Math.floor(Math.log10(n) + 1);
                int len = d;
                for(int i=0;i<len;i++){
                    long no = (long)Math.pow(10,i+1);
                    String rem = String.valueOf(n);
                    long temp = Long.valueOf(rem.substring(len-i-1,len));
                    if(digsum(n+no-temp)<=target){
                        return no-temp;
                    }
                }
               return 0;   
            }
            
        }

    public long digsum(long n){
       long dig =0;
        while(n>0){
            dig+=n%10;
            n/=10;
        }
        return dig;
    }
}