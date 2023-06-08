class Solution {
    public int countNegatives(int[][] grid) {
        int count=0; 
        for(int[]ar:grid){
            count+=(ar.length-binSearch(ar)-1);
        }         
        return count;
    }
    public int binSearch(int[]ar){
        int f=0,l=ar.length-1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(ar[mid]>=0){
                f=mid+1;
            }
            else l=mid-1;
        }
        return l;
    }
}