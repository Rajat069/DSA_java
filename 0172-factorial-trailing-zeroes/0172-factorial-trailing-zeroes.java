class Solution {
    public int trailingZeroes(int n) {
        int trail=0;
        for(int i=5;i<=n;i*=5){
            trail+=(n/i);
        }
        return trail;
    }
}