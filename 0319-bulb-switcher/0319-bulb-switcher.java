class Solution {
    public int bulbSwitch(int n) {
       int c=0;
       double val=1; 
       while((val*val)<=n){
           val++;
           c++;
       }
       return c; 
    }
}
/*
brute force solution
 public int bulbSwitch(int n) {
       int c=0;
       for(int i=1;i<=n;i++){
           double sq=Math.sqrt(i);
           if(sq*sq==(double)(i)){
               c++;
           }
       }
       return c; 
    }
*/