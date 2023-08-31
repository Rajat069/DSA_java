class Solution {
    public int minOperations(int n) {
        int sol=0,cur=1;
        while(cur<n){
            sol+=(n-cur);
            cur+=2;
        }
        return sol;
    }
}