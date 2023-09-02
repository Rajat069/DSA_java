class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[]rem = new int[capacity.length];
        for(int i=0;i<capacity.length;i++){
            rem[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(rem);
        int count=0;
        for(int i:rem){
            if(i==0){
                count++;
                continue;
            }
            else if(i<=additionalRocks){
                additionalRocks-=i;
                count++;
            }
        }
        return count;
    }
}