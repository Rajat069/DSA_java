class Solution {
    public int getWinner(int[] arr, int k) {
        int cur=arr[0],w=0;
        for(int i=1;i<arr.length;i++){
            if(cur<arr[i]){
                cur=arr[i];
                w=0;
            }
            if(++w==k)return cur;
        }
        return cur;
    }
}