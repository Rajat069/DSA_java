//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        int newNum=0,pow=0;
        while(num!=0){
            int temp=num%10;
            if(temp==0){
                newNum+=Math.pow(10,pow)*5;
            }
            else newNum+=Math.pow(10,pow)*temp;
            pow++;
            num/=10;
        }
        return newNum;
    }
}