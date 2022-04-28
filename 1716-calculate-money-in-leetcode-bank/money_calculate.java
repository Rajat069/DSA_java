class Solution {
    public int totalMoney(int n) {
        int ans =0;
        int mon=1;
        int temp=0;
        for(int i=1;i<=n;i++){
            ans+=(mon+temp);
            temp++;
            if(i%7==0){
                mon++;
                temp=0;
            }
        }
        return ans;
    }
}
