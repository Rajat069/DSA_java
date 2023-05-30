class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(k>0){
                k--;
                pq.add(arr[i]);
            }
            else if(Math.abs(pq.peek()-x)>Math.abs(arr[i]-x)){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        ArrayList<Integer>ar=new ArrayList<>();
        while(!pq.isEmpty()){
            ar.add(pq.poll());
        }
        return ar;
    }
}