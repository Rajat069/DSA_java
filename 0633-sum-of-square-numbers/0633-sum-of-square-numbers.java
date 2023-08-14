class Solution {
    public boolean judgeSquareSum(int c) {
       int p1=0,p2=(int)Math.sqrt(c);
       while(p1<=p2){
           long num1=p1*p1;
           long num2=p2*p2;
           if(num1+num2==c)return true;
           else if(num1+num2>c){
               p2--;
           }
           else p1++;
       }
        return false;
    }
}
/*
class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=1)return false;
        for(int i=1;i<=c/2;i++){
            int num1 = i;
            int num2 = c-i;
            if(isPerSq(num1)&&isPerSq(num2)){
                return true;
            }
        }
        return false;
    }
    private boolean isPerSq(int num){
        int n = (int)Math.sqrt(num);
        return n*n==num;
    }
} 
Brute Force O(N)
*/