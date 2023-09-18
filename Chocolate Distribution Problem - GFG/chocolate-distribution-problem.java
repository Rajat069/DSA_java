//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((e, f) -> f - e);
        for (int i = 0; i < m; i++) {
            pq1.offer(a.get(i));
            pq2.offer(a.get(i));
        }
        long diff = pq2.peek() - pq1.peek();
        for (int i = m; i < n; i++) {
            int removedElement = a.get(i - m);
            if (pq1.peek() == removedElement) {
                pq1.poll();
            }
            if (pq2.peek() == removedElement) {
                pq2.poll();
            }
            pq1.offer(a.get(i));
            pq2.offer(a.get(i));
            diff = Math.min(diff, pq2.peek() - pq1.peek());
        }
        return diff;
    }
}