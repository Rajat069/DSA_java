class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> sol = new  HashSet<>();
        HashMap<Long,ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(Long.valueOf(nums[i]), map.getOrDefault(Long.valueOf(nums[i]), new ArrayList<>()));
            map.get(Long.valueOf(nums[i])).add(i);
        }       
        for(int i=0;i<nums.length;i++){
           if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length;j++){
               if(j>i+1&&nums[j]==nums[j-1])continue;
                 for(int q=j+1;q<nums.length;q++){
                   if(q>j+1&&nums[q]==nums[q-1])continue;
                      long sum =nums[i]+nums[j];
                      sum+=nums[q];
                      long val = target-sum; 
                      if(map.containsKey(val)){
                            ArrayList<Integer> index = map.get(val);
                            for(int idx:index){
                                if(idx>q){
                                   List<Integer> ar = new ArrayList<>();
                                   ar.add(nums[i]);
                                   ar.add(nums[j]);
                                   ar.add(nums[q]);
                                   ar.add(nums[idx]);
                                   sol.add(ar);
                                }
                            }
                        } 
                 }
            }
            
        }
        List<List<Integer>> soll = new ArrayList<>();
        soll.addAll(sol);
        return soll;
    }
}