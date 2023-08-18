class Solution {
    class Node{
        int i;
        int j;
        int time;
        Node(int i,int j,int time){
            this.i=i;
            this.j=j;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int[][]sol = new int[grid.length][grid[0].length];
        Queue<Node>queue = new ArrayDeque<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new Node(i,j,0));
                }
                else if(grid[i][j]==1)fresh++;
            }
        }
        if(fresh==0)return 0;
        int[][]dir = {{1,0},{-1,0},{0,-1},{0,1}};
        int maxTime=-1;
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            int x=temp.i;
            int y=temp.j;
            int time=temp.time;
            maxTime=Math.max(maxTime,time);
            sol[x][y]=time;
            for(int cd[]:dir){
                int newr=cd[0]+x;
                int newc=cd[1]+y;
        if(newr>=0&&newr<grid.length&&newc>=0&&newc<grid[0].length&&grid[newr][newc]==1){
                    queue.add(new Node(newr,newc,time+1));
                    grid[newr][newc]=2;
                    fresh--;
                }
            }
        }
        return fresh!=0?-1:maxTime;
    }
}