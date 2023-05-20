class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer>ar = new ArrayList<>();
        for(int i:nums){
            if(i!=val)ar.add(i);
        }
        int k=ar.size(),i=0;
        while(i<k){
            nums[i]=ar.get(i++);
        }
        return k;
    }
}