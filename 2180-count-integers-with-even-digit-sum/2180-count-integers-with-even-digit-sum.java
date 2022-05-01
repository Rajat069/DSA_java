class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
             if(iseven(i))count++;             
        }
        return count;
    }
    public boolean iseven(int num){
        int temp = 0;
        while(num!=0){
            temp+=num%10;
            num/=10;
        }
        return temp%2==0;
    }
}