class Solution {
    public double myPow(double x, int n) {
       return helper(x,Long.valueOf(n));
    }
    public double helper(double num,long pow){
        if (num < -10000 || num > 10000) {
            return 0;
        }
        if(pow==0)return 1;
        if(pow<0){
            pow*=-1;
            num=1/num;
        }
        if(pow%2==0){
            return helper(num*num,pow/2);
        }
        else return num*helper(num,pow-1);
    }
}