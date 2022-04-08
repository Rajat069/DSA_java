// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
       /*String ans = "";
       Stack <Character> st = new Stack<>();
       for(int i=S.length()-1;i>-1;i--){
           if(S.charAt(i)=='.'){
               while(!st.isEmpty()){
                   ans+=st.peek();
                   st.pop();
               }
               ans+='.';
           }
           else st.push(S.charAt(i));
       }
       while(!st.isEmpty()){
           ans+=st.peek();
           st.pop();
       }
       return ans;
       */
       String ans ="";
        StringBuilder sb = new StringBuilder();
        for(int i=S.length()-1;i>-1;i--){
            if(S.charAt(i)=='.'){
                sb.reverse();
                ans+=sb.toString();
                ans+='.';
                sb.delete(0,sb.length());
            }
            else sb.append(S.charAt(i));
        }
        if(sb.length()!=0){
            sb.reverse();
            ans+=sb.substring(0).toString();
        }
        return ans;
    }
}