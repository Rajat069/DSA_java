class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1){
            return flowerbed[0]==0?n<=1?true:false:n==0;
        }
        int canplant=0;
        for(int i=0;i<flowerbed.length;i++){
            if(i==0){
                if(flowerbed[i]==0&&flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    canplant++;
                }
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i]==0&&flowerbed[i-1]==0)canplant++;
            }
            else{
                if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    canplant++;
                }
            }
        }
        return canplant>=n;
    }
}