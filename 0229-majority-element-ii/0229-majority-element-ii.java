class Solution {
    public List<Integer> majorityElement(int[] nums) {
      Arrays.sort(nums);
      List<Integer> ans = new ArrayList<>();
      int idx=0;
      while(idx<nums.length){
          int no = nums[idx];
          int loc=0;
          while(idx<nums.length&&no==nums[idx]){
              idx++;
              loc++;
          }
          if(loc>nums.length/3)ans.add(no);
      }  
     return ans;
    }
}