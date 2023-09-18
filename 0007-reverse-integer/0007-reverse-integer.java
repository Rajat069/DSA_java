class Solution {
    public int reverse(int x) {
        int sol=0;
        while(x!=0){
            if(sol>214748364||sol<-214748364){
                  return 0;
            }
            sol=sol*10+x%10;
            x/=10;
        }
        if(x<0)return -1*(int)sol;
        return sol;
    }
}