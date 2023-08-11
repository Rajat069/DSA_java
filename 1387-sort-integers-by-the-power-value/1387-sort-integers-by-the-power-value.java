class Solution {
    HashMap<Integer,Integer> hm = new HashMap<>();
    {
        hm.put(1,0);
    }
    public int getKth(int lo, int hi, int k) {
        for(int i=lo;i<=hi;i++){
             power(i);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->{
            int temp1 = hm.get(a);
            int temp2 = hm.get(b);
            if(temp1==temp2){
                return a-b;
            }
            return temp1-temp2;
        });
        for(int i=lo;i<=hi;i++){
            pq.offer(i);
        }
        int val=0;
        while(!pq.isEmpty()&&k!=0){
            val=pq.poll();
            k--;
        }
        return val;
    }
    public int power(int n){
         if(n==1)return 0;
         if(hm.containsKey(n))return hm.get(n);
         int oc=0,ev=0;
         if(n%2==1){
             oc=1+power(n*3+1);
         }
         if(n%2==0){
             ev=1+power(n/2);
         }
         hm.put(n,ev+oc);
         return hm.get(n);
    }
}