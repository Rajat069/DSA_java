class Solution {
    public int minCostConnectPoints(int[][] points) {
        boolean[]visited = new boolean[points.length];
        int[]min=new int[points.length];
        int numEdge=0,cur=0,minCost=0;
        visited[0]=true;
        for(int i=1;i<points.length;i++){
            min[i]=Integer.MAX_VALUE;
        }
        while(numEdge++<points.length-1){
            int minEdge=Integer.MAX_VALUE;
            int nextP=-1;
            for(int i=0;i<points.length;i++){
                if(!visited[i]){
                    int dis=Math.abs(points[cur][0]-points[i][0])+Math.abs(points[cur][1]-points[i][1]);
                    min[i]=Math.min(dis,min[i]);
                    if(minEdge>min[i]){
                        minEdge=min[i];
                        nextP=i;
                    }
                }
            }
                cur=nextP;
                visited[cur]=true;
                minCost+=minEdge;
        }
        return minCost;
    }
}