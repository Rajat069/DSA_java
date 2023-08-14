class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
             if(a.length()==b.length()){
                 int p=0;
                 while(p<a.length()){
                     if(a.charAt(p)==b.charAt(p)){
                         p++;
                         continue;
                     }
                     return b.charAt(p)-a.charAt(p);
                 }
             }
            return b.length()-a.length();
        });
        for(String no:nums){
            pq.offer(no);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.peek();
    }
}