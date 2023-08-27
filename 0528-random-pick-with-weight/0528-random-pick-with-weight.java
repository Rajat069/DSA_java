class Solution {
    int sum=0;
    int[]prefix;
    public Solution(int[] w) {
        prefix=new int[w.length];
        prefix[0]=w[0];
        for(int i=1;i<w.length;i++){
          prefix[i] = w[i] + prefix[i - 1];
        }
        sum=prefix[w.length-1];
    }
    
    public int pickIndex() {
        Random r = new Random();
        int no=r.nextInt(sum)+1;
        return binSearch(no);
    }
    private int binSearch(int tar){
        int f=0,l=prefix.length-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(prefix[mid]>=tar){
                l=mid-1;
            }
            else f=mid+1;
        }
        return f;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */