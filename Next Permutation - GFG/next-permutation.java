//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
           List<Integer> ans_list= new ArrayList<>();
           for(int i:arr){
               ans_list.add(i);
           }
           int p1=arr.length-2;
           int p2=arr.length-1;
           while(p1>=0&&arr[p1]>=arr[p1+1]){
               p1--;
           }
           if(p1==-1){
               Collections.reverse(ans_list);
           }else{
               while(p2>=0&&arr[p2]<=arr[p1]){
                 p2--;
               }
               Collections.swap(ans_list,p1,p2);
               reverseList(ans_list,p1+1,arr.length-1);
           }           
           return ans_list;
           
    }
        public static void reverseList(List<Integer> list, int start, int end) {
        List<Integer> reversedPortion = new ArrayList<>();
        for (int i = end; i >= start; i--) {
            reversedPortion.add(list.get(i));
        }
        for (int i = 0; i < reversedPortion.size(); i++) {
            list.set(start + i, reversedPortion.get(i));
        }
    }

}