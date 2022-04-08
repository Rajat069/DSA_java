class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for(int i=stones.length-2;i>-1;i--){
            Arrays.sort(stones);
            stones[i]=Math.abs(stones[i+1]-stones[i]);
        }
        return stones[0];
    }
}