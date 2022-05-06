class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] temp = new int[46];
        Arrays.fill(temp,0);
        for(int i=lowLimit;i<=highLimit;i++){
            if(i<=9)temp[i]++;
            else temp[digitsum(i)]++;
        }
        int max=0;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>max)max=temp[i];
        }
        return max;
    }
      public int digitsum(int num){
         int ans=0;
         while(num!=0){
            ans+=num%10;
            num/=10;
         }
        return ans;
    }
}
