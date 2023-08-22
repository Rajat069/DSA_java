class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       PriorityQueue<int[]> pq = new  PriorityQueue<>((a,b)->{
           if(a[1]==b[1])return a[0]-b[0];
           return a[1]-b[1];
       });
        for(int i=0;i<mat.length;i++){
            int onec=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    onec++;
                }
            }
            int[]ar = {i,onec}; 
            pq.offer(ar);
        }
        int[]sol = new int[k];
        for(int i=0;i<k;i++){
            sol[i]=pq.poll()[0];
        }
        return sol;
    }
}