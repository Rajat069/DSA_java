class Solution {
    public boolean isHappy(int n) {
        if(n==1)return true;
        if(n/10==0&&n!=7)return false;
        int num=0,temp=n;
        while(temp!=0){
            num+=((temp%10)*(temp%10));
            temp/=10;
        }
        if(num==1)return true;
        return isHappy(num);
    }
}