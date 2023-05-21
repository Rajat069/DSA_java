class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int idx=1;
        for(int i=citations.length-1;i>=0;i--,idx++){
            if(citations[i]<idx)break;
        }
        return idx-1;
        
    }
}