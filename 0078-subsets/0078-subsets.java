class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        DFS(nums, new ArrayList<>(), 0);
        return sol;
    }
    
    public void DFS(int[] nums, List<Integer> temp, int idx) {
        if (idx == nums.length) {
            sol.add(new ArrayList<>(temp)); 
            return;
        }
        DFS(nums, temp, idx + 1);
        temp.add(nums[idx]);
        DFS(nums, temp, idx + 1);
        temp.remove(temp.size() - 1);
    }
}
