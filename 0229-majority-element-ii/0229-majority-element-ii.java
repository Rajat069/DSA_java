class Solution {
    public List<Integer> majorityElement(int[] nums) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int i:nums){
           hm.put(i,hm.getOrDefault(i,0)+1);
      }
      List<Integer> ans = new ArrayList<>();  
      for(int i:hm.keySet()){
          if(hm.get(i)>nums.length/3)ans.add(i);
      }
     return ans;
    }
}