class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
         int[][] dp = new int[matrix.length][matrix[0].length];
         PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(i==0&&j==0){
                     pq.offer(matrix[0][0]);
                     dp[0][0]=matrix[0][0];
                 }
                 else if(i==0){
                     pq.offer(matrix[i][j]^dp[i][j-1]);
                     dp[i][j]=matrix[i][j]^dp[i][j-1];
                 }
                 else if(j==0){
                     pq.offer(matrix[i][j]^dp[i-1][j]);
                     dp[i][j]=matrix[i][j]^dp[i-1][j];
                 }
                 else{
                     int xor = matrix[i][j]^dp[i-1][j]^dp[i-1][j-1]^dp[i][j-1];
                     pq.offer(xor);
                     dp[i][j]=xor;
                 }
             }
         }
        while(k-->1){
            pq.poll();
        }
        return pq.peek();
    }
}