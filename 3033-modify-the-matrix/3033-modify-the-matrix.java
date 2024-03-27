class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][]sol=new int[matrix.length][matrix[0].length];
        int[]max=new int[matrix[0].length];
        int p=0;
        for(int c=0;c<matrix[0].length;c++){
            for(int r=0;r<matrix.length;r++){
                max[p]=Math.max(matrix[r][c],max[p]);
            }
            p++;
        }
        p=0;
        for(int c=0;c<matrix[0].length;c++){
            for(int r=0;r<matrix.length;r++){
                if(matrix[r][c]==-1){
                    sol[r][c]=max[p];
                }
                else sol[r][c]=matrix[r][c];
            }
            p++;
        }
        return sol;
    }
}