// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String s)
    {
        String ans="";
       Stack<Character> st = new Stack<>();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='.'){
               while(!st.isEmpty()){
                   ans+=st.peek();
                   st.pop();
               }
               ans+='.';
           }
           else st.push(s.charAt(i));
       }
       if(!st.isEmpty()){
        while(!st.isEmpty()){
                   ans+=st.peek();
                   st.pop();
             }
       }
       return ans;
    }
}