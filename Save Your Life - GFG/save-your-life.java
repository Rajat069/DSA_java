//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
   static String maxSum(String w, char x[], int b[], int n) {
    HashMap<Character, Integer> hm = new HashMap<>();
    for (int i = 0; i < x.length; i++) {
        hm.put(x[i], b[i]);
    }
    StringBuilder temp = new StringBuilder();
    StringBuilder ans = new StringBuilder();
    int max=Integer.MIN_VALUE;
    int cur_sum=0;
    for(int i=0;i<w.length();i++){
        char c=w.charAt(i);
        cur_sum+=(hm.containsKey(c)?hm.get(c):c);
        temp.append(c);
        if(cur_sum>max){
            ans=new StringBuilder(temp);
            max=cur_sum;
        }
        if(cur_sum<0){
            cur_sum=0;
            temp=new StringBuilder();
        }
    } 
    return ans.toString();
}

}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends