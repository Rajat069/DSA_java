class Solution {
    public int[] countBits(int n) {
        int[] bit_count = new int[n+1];
        for(int i=0;i<=n;i++){
            bit_count[i]=Integer.bitCount(i);
        }
        return bit_count;
    }
}