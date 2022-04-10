class Solution {
    public int largestInteger(int num) {
        int numcopy = num;
        int nodig = 0;
        while(numcopy!=0){
           nodig++;
           numcopy/=10;
        }
        int numar[] = new int[nodig];
        while(num!=0){
            numar[nodig-1]=num%10;
            num/=10;
            nodig--;
        }
        for(int i=0;i<numar.length-1;i++){
          for(int j=i+1;j<numar.length;j++){   if(numar[j]%2==1&&numar[i]%2==1||numar[j]%2==0&&numar[i]%2==0){
            if(numar[j]>numar[i]){
                int temp = numar[j];
                numar[j]=numar[i];
                numar[i]=temp;
            }
           }
         }
        }
        int ans = 0;
        int len = numar.length-1;
        for(int i:numar){
            ans+=i*Math.pow(10,len);
            len--;
        }
        return ans;
    }
}