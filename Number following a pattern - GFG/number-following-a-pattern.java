// { Driver Code Starts
//Initial Template for Java
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
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int temp = 1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='D'){
                st.push(temp);
                temp++;
            }
            else{
                st.push(temp);
                temp++;
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }
        }
        st.push(temp);
        while(!st.isEmpty()){
                    sb.append(st.pop());
                }
        return sb.toString();
    }
}
