class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         int[]freq=new int[100001];
         for(int i:nums){
             freq[i]++;
         }
        List<Integer>sol=new ArrayList<>();
        int g=0;
        for(int i:freq){
            if(i==2){
                sol.add(g);
            }
            g++;
        }
        return sol;
    }
}