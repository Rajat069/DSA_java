class Solution {
    public int tribonacci(int n) {
        return tibo(n,new int[n+1]);
    }
    public int tibo(int n,int ar[]){
        if(n==0){
            return 0;
        }
        if(n==1||n==2)return 1;
        if(ar[n]!=0)return ar[n];
        int num1=tibo(n-1,ar);
        int num2=tibo(n-2,ar);
        int num3=tibo(n-3,ar);
        int sum=num1+num2+num3;
        ar[n]=sum;
        return sum;
    }
}