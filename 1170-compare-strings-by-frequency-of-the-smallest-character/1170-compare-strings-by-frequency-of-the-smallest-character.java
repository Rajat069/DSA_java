class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] qr = new int[queries.length];
        int[] wd = new int[words.length];
        int idx=0;
        for(String s:queries){
            qr[idx++]=small_count(s);
        }
        idx=0;
        for(String s:words){
            wd[idx++]=small_count(s);
        }
        Arrays.sort(wd);
        int[] ans = new int[qr.length];
        int p=0;
        for(int i:qr){
            int j=wd.length-1;
            int c=0;
            while(j>=0&&wd[j]>i){
                j--;
                c++;
            }
            ans[p++]=c;
        }
        return ans;
    }
    public int small_count(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        char sm=arr[0];
        int count=1,idx=1;
        while(idx<arr.length&&sm==arr[idx++]){
            count++;
        }
        return count;
    }
}