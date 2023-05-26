class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int l=matrix.length-1;
            for(int j=0;j<l;j++,l--){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][l];
                matrix[i][l]=temp;
            }
        }
    }
}