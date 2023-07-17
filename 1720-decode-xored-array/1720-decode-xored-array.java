class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] sol = new int[encoded.length+1];
        sol[0]=first;
        sol[1]=first^encoded[0];
        int j=2;
        for(int i=1;i<encoded.length;i++){
             sol[j++]=sol[i]^encoded[i];                
        }
        return sol;
    }
}