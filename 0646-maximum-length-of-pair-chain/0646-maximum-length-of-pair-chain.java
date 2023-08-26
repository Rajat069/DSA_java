class Solution {
    public int findLongestChain(int[][] pairs) {
         Comparator<int[]> customComparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                return Integer.compare(arr1[1], arr2[1]);
            }
        };
        Arrays.sort(pairs,customComparator);
        int longChain=1;
        int[]cur=pairs[0];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>cur[1]){
                longChain++;
                cur=pairs[i];
            }
        }
        return longChain;
    }
}