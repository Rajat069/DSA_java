//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        return fibo(n,new int[n+1]);
    }
    public static int fibo(int n,int[]fb){
        if(n==0||n==1){
            return n;
        }
        if(fb[n]!=0){
            return fb[n];
        }
        int f1 = fibo(n-1,fb)%1000000007;
        int f2 = fibo(n-2,fb)%1000000007;
        int sol = (f1+f2)%1000000007;
        
        fb[n]=sol;
        return sol;
    }
}