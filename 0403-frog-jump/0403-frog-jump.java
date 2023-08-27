class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>>dp = new HashMap<>();
        for(int i:stones){
            dp.put(i,new HashSet<>());
        }
        dp.get(stones[0]).add(1);
        for(int val:stones){
            for(int jump:dp.get(val)){
                if(jump!=0&&dp.containsKey(jump+val)){
                    dp.get(jump+val).add(jump);
                    dp.get(jump+val).add(jump-1);
                    dp.get(jump+val).add(jump+1);
                }
            }
        }
        return !dp.get(stones[stones.length-1]).isEmpty();
    }
    
}