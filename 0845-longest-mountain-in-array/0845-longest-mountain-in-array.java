class Solution {
    public int longestMountain(int[] arr) {
        int longs=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                int l=i;
                while(l>0&&arr[l]>arr[l-1]){
                    l--;
                }
                while(i<arr.length-1&&arr[i]>arr[i+1]){
                    i++;
                }
                longs=Math.max(longs,i-l+1);
            }
        }
        return longs;
    }
}