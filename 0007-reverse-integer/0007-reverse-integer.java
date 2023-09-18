class Solution {
    public int reverse(int x) {
        long sol=0;
        while(x!=0){
            int l=x%10;
            sol+=l;
            sol*=10;
            x/=10;
        }
        sol/=10;
        if(sol>Integer.MAX_VALUE||sol<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0)return -1*(int)sol;
        return (int)sol;
    }
}