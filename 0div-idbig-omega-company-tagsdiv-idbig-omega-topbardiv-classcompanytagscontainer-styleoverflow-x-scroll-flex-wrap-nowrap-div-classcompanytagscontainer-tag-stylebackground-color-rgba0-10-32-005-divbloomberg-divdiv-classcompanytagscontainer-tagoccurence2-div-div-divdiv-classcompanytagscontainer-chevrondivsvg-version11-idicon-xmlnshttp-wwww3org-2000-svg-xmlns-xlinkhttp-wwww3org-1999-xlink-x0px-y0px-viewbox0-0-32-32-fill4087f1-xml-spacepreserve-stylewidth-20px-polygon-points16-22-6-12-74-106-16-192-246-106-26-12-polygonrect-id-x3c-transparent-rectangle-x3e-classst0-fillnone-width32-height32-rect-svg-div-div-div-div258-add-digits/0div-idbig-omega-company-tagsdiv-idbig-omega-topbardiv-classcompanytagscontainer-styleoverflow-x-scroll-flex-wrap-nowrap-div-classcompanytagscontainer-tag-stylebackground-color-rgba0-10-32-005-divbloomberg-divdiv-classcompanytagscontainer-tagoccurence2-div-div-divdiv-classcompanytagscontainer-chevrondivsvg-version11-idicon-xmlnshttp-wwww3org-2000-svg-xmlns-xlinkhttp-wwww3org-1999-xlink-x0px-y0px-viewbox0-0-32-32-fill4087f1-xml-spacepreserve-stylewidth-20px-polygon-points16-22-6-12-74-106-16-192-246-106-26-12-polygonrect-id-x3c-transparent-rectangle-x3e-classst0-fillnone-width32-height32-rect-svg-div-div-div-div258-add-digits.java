class Solution {
    public int addDigits(int num) {
        if(num/10==0){
            return num;
        }
        int newD=0;
        while(num!=0){
            newD+=num%10;
            num/=10;
        }
        return addDigits(newD);
    }
}