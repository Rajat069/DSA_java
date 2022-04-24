// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    
	public static void main (String[] args)
	{
	     //Taking input using Scanner class
    	 Scanner sc = new Scanner(System.in);
    	 
    	 //taking count of total testcases
    	 int t = sc.nextInt();
    	 
    	 boolean flag = false;
    	 while(t-- > 0){
    	   
    	   //taking the String
    	   String s=sc.next();
    	   
    	   Geeks obj=new Geeks();
    	   
    	   //calling follPatt() method
    	   //of class Geeks and passing
    	   //String as parameter
    	   obj.follPatt(s);
    	   
    	 }
    }
}


 // } Driver Code Ends
//User function Template for Java



class Geeks{
    
    static void follPatt(String s)
    {
        
      int cc=0;
      char[] c = s.toCharArray();
      Boolean b = true;
      for(int i=0;i<c.length;){
          while(i<c.length&&c[i]=='x'){
              cc++;
              i++;
          }
          while(i<c.length&&c[i]=='y'){
              cc--;
              i++;
          }
          if(cc!=0){
              b=false;
              break;
          }
      }
          if(b&&cc==0)System.out.println(1);
          else System.out.println(0);
    }
}


// { Driver Code Starts.
  // } Driver Code Ends