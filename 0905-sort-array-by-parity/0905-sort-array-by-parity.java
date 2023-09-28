class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                even.add(i);
            }
            else odd.add(i);
        }
        int[]sol = new int[nums.length];
        int idx=0;
        for(int i=0;i<even.size();i++){
            sol[idx++]=even.get(i);
        }
        for(int i=0;i<odd.size();i++){
            sol[idx++]=odd.get(i);
        }
        return sol;
    }
}