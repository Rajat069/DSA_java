//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean[][] dp = new boolean[N+1][sum+1];
        for(int i=0;i<dp.length;i++){ //i rep elements of given array
            for(int j=0;j<dp[0].length;j++){ // j rep runs 0 till taget
                if(i==0&&j==0){ //first cell here can make 0 run as empty set can form 0 run
                    dp[i][j]=true;
                }
                else if(i==0){ // first row will be false as empty set cannot be used to make any runs except 0
                    dp[i][j]=false;
                }
                else if(j==0){  //first collumn will be true as 0 run can be formed by not participating in subset
                    dp[i][j]=true;
                }
                else{
                    if(dp[i-1][j]==true)dp[i][j]=dp[i-1][j]; // if team can form run there is no need to include element in subset
                    else{  
                        int rem = arr[i-1];  // if it can then we will have to check if selected element can score greator then req run
                        if(j>=rem && dp[i-1][j-rem]==true){ // then we will check if remaing runs can be formed by team or not 7-4= 3?? possible
                            dp[i][j]=true;
                        }
                    }
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}