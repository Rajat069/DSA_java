// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
           int val = arr[i];
           int c = 1;
           while(i+1<n&&val==arr[i+1]){
               c++;
               i++;
           }
           if(c>=2) ans.add(val);
        }
        if(ans.isEmpty()==true){
            ans.add(-1);
        }
        return ans;
    }
}
