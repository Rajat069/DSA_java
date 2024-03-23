class Solution {
    class Pair<T, U> {
    T value1;
    U value2;

    public Pair(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
     }
 }
    class PairComparator implements Comparator<Pair<?, Integer>> {
    @Override
    public int compare(Pair<?, Integer> p1, Pair<?, Integer> p2) {
        return Integer.compare(p2.value2, p1.value2);
    }
}

    public int maximumUnits(int[][] boxTypes, int truckSize) {
 PriorityQueue<Pair<?, Integer>> pq = new PriorityQueue<>(new PairComparator());
        for(int[]ar:boxTypes){
            pq.offer(new Pair<>(ar[0],ar[1]));
        }
        int boxes=0;
        while(!pq.isEmpty()&&truckSize>0){
            Pair<?,Integer>pair=pq.poll();
            if((int)pair.value1<truckSize){
                boxes+=((int)pair.value1*pair.value2);
                truckSize-=(int)pair.value1;
            }
            else{
                boxes+=truckSize*pair.value2;
                truckSize=0;
            }
        }
        return boxes;
    }
}