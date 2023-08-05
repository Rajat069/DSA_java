class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            double distanceA = Math.sqrt(Math.pow(Math.abs(0-a[0]), 2) + Math.pow(Math.abs(0-a[1]), 2));
double distanceB = Math.sqrt(Math.pow(Math.abs(0-b[0]), 2) + Math.pow(Math.abs(0-b[1]), 2));
            return Double.compare(distanceA, distanceB);
        });
        for(int []pointsSet:points){
            pq.offer(pointsSet);
        }
        int[][]sol = new int[k][2];
        for(int i=0;i<k;i++){
            sol[i]=pq.poll();
        }
        return sol;
    }
}