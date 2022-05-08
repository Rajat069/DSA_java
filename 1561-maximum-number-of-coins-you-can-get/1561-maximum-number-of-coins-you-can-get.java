class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int p3=piles.length-2;
        int sum=0;
        for(int i=0;i<piles.length/3;i++){
            sum+=piles[p3];
            p3-=2;
        }
        return sum;
    }
}