class Solution {
    public int countDigits(int num) {
        return helper(num,num);
    }   
    public int helper(int num,int cur){
         if(cur==0)return 0;
         return ((num%(cur%10))==0?1:0)+helper(num,cur/10);
    }
}