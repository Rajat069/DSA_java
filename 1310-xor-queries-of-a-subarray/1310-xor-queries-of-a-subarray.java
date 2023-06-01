class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[]pre = new int[arr.length];
        int[]sol = new int[queries.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=arr[i]^pre[i-1];
        }
        int idx=0;
        for(int qr[]:queries){
            int f=qr[0],l=qr[1];
            if(f==0){
                sol[idx]=pre[l];
            }
            else sol[idx]=pre[l]^pre[f-1];
            idx++;
        }
        return sol;
    }
}