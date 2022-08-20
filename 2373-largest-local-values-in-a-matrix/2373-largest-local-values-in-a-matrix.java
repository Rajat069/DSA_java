class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid.length-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                int max = 0;
                for(int l=i;l<i+3;l++){
                    for(int q=j;q<j+3;q++){
                        max=Math.max(max,grid[l][q]);
                    }
                }
                ans[i][j]=max;
            }
        }
        return ans;
    }
}