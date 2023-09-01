class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0){
            return false;
        }
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i:hand){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        Arrays.sort(hand);
        for (int card:hand){
            if(hm.get(card)<1){
                continue;
            }
            for(int i=0;i<groupSize;i++){
                if (!hm.containsKey(card+i)||hm.get(card+i)<=0){
                    return false;
                }
                hm.put(card+i,hm.get(card+i)-1);
            }
        }
        return true;
    }
}
