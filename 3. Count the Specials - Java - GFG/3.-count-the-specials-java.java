// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;


 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with countSpecials as its member function
* a : input array
* n : size of array
k : to calculate floor(n/k)
*/
class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        Arrays.sort(a);
        int ans =0;
        for(int i=0;i<a.length;i++){
            int count=1;
            while(i<a.length-1&&a[i]==a[i+1]){
                count++;
                i++;
            }
            if(count==f)ans++;
        }
        System.out.println(ans);
    }
}

// { Driver Code Starts.

// Driver class
class GFG {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of array
		    int sizeof_array = sc.nextInt();
		    
		    //taking value of k
		    int k = sc.nextInt();
		    
		    //creating an array
		    int a[] = new int[sizeof_array];
		    
		    //inserting elements to the array
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    //creating an object of class Geeks
		    Geeks obj = new Geeks();
		    
		    //calling countSpecials method of 
		    //class Geeks
		    obj.countSpecials(a, sizeof_array, k);
		}
		
	}
}  // } Driver Code Ends