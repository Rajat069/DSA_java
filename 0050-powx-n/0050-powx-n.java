class Solution {
    public double myPow(double x, int n) {
          double sol=1;
          long N=n; 
          if(N<0)N*=-1;
          while(N!=0){
              if(N%2==0){
                  x=x*x;
                  N/=2;
              }
              else{
                  sol*=x;
                  N--;
              }
          }
        if(n<0)return 1.0/sol;
        return sol;
    }
}