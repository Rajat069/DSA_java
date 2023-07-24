class Solution {
    public double myPow(double x, int n) {
          double sol=1;
          long N=n; 
          if(N<0)N*=-1;
          while(N!=0){
              if(N%2==0){
                  x=x*x; //if pow is even do square of number and reduces power by 1/2 like 2^6 = 4^3 
                  N/=2;
              }
              else{
                  sol*=x; //if even then multply sol by number once and reduce pow like 4^3 to 1*4 = 4 and 4^2 now sol=16 pow=1 now 16*16 = 64 as pow is 1 and it needs to be 0 to be out of loop
                  N--;
              }
          }
        if(n<0)return 1.0/sol;
        return sol;
    }
}