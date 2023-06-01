//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
         if(A[0][0]==0||A[X][Y]==0)return -1;
         int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
         Queue<int[]>queue = new LinkedList<>();
         queue.add(new int[]{0,0,0});
         while(!queue.isEmpty()){
             int[] temp = queue.poll();
             int r=temp[0],c=temp[1],cost=temp[2];
             if(r==X&&c==Y)return cost;
             for(int[]move:dir){
                 int nextr=move[0]+r;
                 int nextc=move[1]+c;
                 if(nextr>=0&&nextr<N&&nextc>=0&&nextc<M&&A[nextr][nextc]==1){
                     queue.add(new int[]{nextr,nextc,cost+1});
                     A[nextr][nextc]=0;
                 }
             }
         }
         return -1;
    }
};