class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->{
            return a[0]-b[0];
        });
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            if(pq.size()>k)pq.poll();
        };
        HashSet<Integer>hs = new HashSet<>();
        while(!pq.isEmpty()){
            hs.add(pq.poll()[1]);
        }
        int[]sol = new int[k];
        for(int i=0,p=0;i<nums.length;i++){
            if(hs.contains(i))sol[p++]=nums[i];
        }
        return sol;
    }
}