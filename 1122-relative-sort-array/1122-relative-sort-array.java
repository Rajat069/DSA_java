class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            hm.put(arr2[i],i);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
            return hm.get(a)-hm.get(b);
        });
        ArrayList<Integer>ar=new ArrayList<>();
        for(int i:arr1){
            if(hm.containsKey(i)){
                pq.offer(i);
            }
            else ar.add(i);
        }
        Collections.sort(ar);
        int[]sol=new int[arr1.length];
        int idx=0,i=0;
        while(!pq.isEmpty()){
            sol[idx++]=pq.poll();
        }
        while(idx<arr1.length){
            sol[idx++]=ar.get(i++);
        }
        return sol;
    }
}