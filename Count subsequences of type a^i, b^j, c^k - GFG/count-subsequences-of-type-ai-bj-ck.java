//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int t = Integer.parseInt(sc.next());
		
		while(t>0)
		{
		    String s = sc.next();
		    
		    Solution T = new Solution();
		    System.out.println(T.fun(s));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int fun(String s)
    {
        int a=0;
        int ab=0;
        int abc=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'){
                a=(2*a+1)%1000000007;
            }
            else if(c=='b'){
                ab=((2*ab)%1000000007+a)%1000000007;
            }
            else if(c=='c'){
                abc=((abc*2)%1000000007+ab)%1000000007;
            }
        }
        return abc;
    }
}