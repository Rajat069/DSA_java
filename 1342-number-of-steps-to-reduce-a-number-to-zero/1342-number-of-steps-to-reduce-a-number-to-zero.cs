public class Solution {
    public int NumberOfSteps(int num) {
             return ret(num);
    }
    public int ret(int num){
        if(num==0)return 0;
        if(num%2==0)return ret(num/2)+1;
        else return ret(num-1)+1;
    }
}