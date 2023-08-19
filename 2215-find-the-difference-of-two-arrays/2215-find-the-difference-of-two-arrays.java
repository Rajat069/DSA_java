class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> sol = new ArrayList<>();
        HashSet<Integer>hs1 = new HashSet<>();
        HashSet<Integer>hs2 = new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        for(int i:nums2){
            hs2.add(i);
        }
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        for(int i:hs1){
            if(!hs2.contains(i)){
                list2.add(i);
            }
        }
        for(int i:hs2){
            if(!hs1.contains(i)){
                list1.add(i);
            }
        }
        sol.add(list2);
        sol.add(list1);
        return sol;
    }
}