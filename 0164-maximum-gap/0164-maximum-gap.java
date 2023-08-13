class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)return 0;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i:nums){
            pq.offer(i);
        }
        int pre=pq.poll(),maxDif=0;
        while(!pq.isEmpty()){
            int no=pq.poll();
            maxDif=Math.max(Math.abs(pre-no),maxDif);
            pre=no;
        }
        return maxDif;
    }
}