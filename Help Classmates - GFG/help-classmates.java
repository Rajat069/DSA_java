// { Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 

// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int a[], int n) 
	{ 
	   Stack<Integer> st = new Stack<>();
	   st.push(n-1);
	   int[] ans = new int[n];
	   ans[n-1]=-1;
	   for(int i=n-2;i>-1;i--){
	       while(!st.isEmpty()&&a[i]<=a[st.peek()]){
               st.pop();
           }
           if(st.isEmpty())ans[i]=-1;
           else ans[i]=a[st.peek()];
           st.push(i);
	   }
	   return ans;  
	} 
}
