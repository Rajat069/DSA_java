class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
         ArrayList<Double>ar = new ArrayList<>();
         HashMap<Double,Pair<Integer,Integer>>hm = new HashMap<>();
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                 double sol = (double)arr[i]/(double)arr[j];
                 ar.add(sol);
                 Pair<Integer,Integer>pr = new Pair<>(arr[i],arr[j]);
                 hm.put(sol,pr);
             }
         }
         PriorityQueue<Double>pq = new PriorityQueue<>();
         for(int i=0;i<ar.size();i++){
             if(k>0){
                pq.add(-ar.get(i)); 
                k--;
             }
             else if(-pq.peek()>ar.get(i)){
                 pq.remove();
                 pq.add(-ar.get(i));
             }
         }
        return new int[]{hm.get(-pq.peek()).getKey(),hm.get(-pq.peek()).getValue()};
    }
}