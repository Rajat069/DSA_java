class Solution {
    List<List<Integer>> sol = new ArrayList<>();
    HashMap<Integer, Integer> hs = new HashMap<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int i : nums) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        helper(nums, new ArrayList<>());
        return sol;
    }

    public void helper(int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            sol.add(new ArrayList<>(temp));
            return;
        }

        for (int num : hs.keySet()) {
            int count = hs.get(num);
            if (count > 0) {
                temp.add(num);
                hs.put(num, count - 1);
                helper(nums, temp);
                hs.put(num, count);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
