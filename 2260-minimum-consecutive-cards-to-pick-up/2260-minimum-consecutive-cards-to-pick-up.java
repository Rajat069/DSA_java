class Solution {
    public int minimumCardPickup(int[] cards) {
        int pick=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<cards.length;i++){
            if(hm.containsKey(cards[i])){
                pick=Math.min(pick,i-hm.get(cards[i])+1);
                hm.put(cards[i],i);
            }
            else{
                hm.put(cards[i],i);
            }
        }
        return pick==Integer.MAX_VALUE?-1:pick;
    }
}