class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int i = 0;
        Integer val = null; // use Integer instead of int to allow for null values
        for (; i < k; i++) {
            treeMap.put(nums[i], treeMap.getOrDefault(nums[i], 0) + 1);
        }
        int loc = 1,f=0;
        for (int q : treeMap.keySet()) {
            int freq = treeMap.get(q);
            if(q<0)f+=freq;
            else if(q>0)break;
            if(f>=x){
                val=q;
                break;
            }
        }
        int[] sol = new int[nums.length - k + 1];
        sol[0] = val != null ? val : 0; // if no negative number was found, set val to 0
        int idx = 1;
        for (; i < nums.length; i++) {
            int prev = nums[idx - 1];
            if (treeMap.containsKey(prev)) {
                treeMap.put(prev, treeMap.get(prev) - 1);
                if (treeMap.get(prev) == 0) {
                    treeMap.remove(prev);
                }
            }
            treeMap.put(nums[i], treeMap.getOrDefault(nums[i], 0) + 1);
            int l = 1, v = 0;
            f=0;
            for (int q : treeMap.keySet()) {
                int freq = treeMap.get(q);
                if(q<0)f+=freq;
                else if(q>0)break;
                 if(f>=x){
                   v=q;
                   break;
               }
            }
            sol[idx++] = v; // if no negative number was found, set v to 0
        }
        return sol;
    }
}
