class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i:nums2){
            if(hs1.contains(i)&&!ar.contains(i)){
                ar.add(i);
            }   
        }
        return ar.stream().mapToInt(Integer::intValue).toArray();
    }
}