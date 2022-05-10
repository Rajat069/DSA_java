class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ans.add(index[i],nums[i]);
        }
        int ar[] = new int[ans.size()];
        for(int i=0;i<ar.length;i++){
         ar[i]=ans.get(i);   
        }
        return ar;
    }
}