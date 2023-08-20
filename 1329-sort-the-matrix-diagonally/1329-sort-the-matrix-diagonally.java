class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>>hm = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(hm.containsKey(i-j)){
                    hm.get(i-j).add(mat[i][j]);
                }
                else{
                    PriorityQueue<Integer>ar = new PriorityQueue<>();
                    ar.add(mat[i][j]);
                    hm.put(i-j,ar);
                }
            }
        }
        int[][]sol = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                sol[i][j]=hm.get(i-j).poll();
            }
        }
        return sol;
    }
}