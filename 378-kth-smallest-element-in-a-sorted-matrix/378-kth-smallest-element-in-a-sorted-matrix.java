class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int[] ar = new int[matrix.length*matrix[0].length];
        int idx = 0;
        for(int[] i:matrix){
            for(int j:i){
                ar[idx++]=j;
            }
        }
        Arrays.sort(ar);
        return ar[k-1];
    }
}