class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int[]>queue = new ArrayDeque<>();
        queue.add(new int[]{entrance[0],entrance[1]});
        boolean[][]seen = new boolean[maze.length][maze[0].length];
        int steps=0;
        seen[entrance[0]][entrance[1]]=true;
        while(!queue.isEmpty()){
             steps++;
             int size=queue.size();
             for(int i=0;i<size;i++){
             int[]pos = queue.poll();
             int r=pos[0];
             int c=pos[1];
             for(int d[]:dir){
                 int newr=d[0]+r;
                 int newc=d[1]+c;
                 if(newr>=0&&newr<maze.length&&newc>=0&&newc<maze[0].length&&maze[newr][newc]!='+'&&!seen[newr][newc]){
                 if(newr==0||newc==0||newr==maze.length-1||newc==maze[0].length-1)return steps;   
                 queue.offer(new int[]{newr,newc});
                 seen[newr][newc]=true;
                }
             }
          }
        }
        return -1;
    }
}