// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}// } Driver Code Ends




class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
         char[] ar = line.toCharArray();
         Arrays.sort(ar);
         int ans =Integer.MIN_VALUE;
         char ans1 = line.charAt(0);
         for(int i=0;i<ar.length-1;i++){
             int len =0;
             while(i<ar.length-1&&ar[i]==ar[i+1]){
                 i++;
                 len++;
             }
             if(ans<len){
                ans1=ar[i];
                ans=len;
             }
         }
         return ans1;
    }
    
}