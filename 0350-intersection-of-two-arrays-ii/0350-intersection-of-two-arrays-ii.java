class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>ar = new ArrayList<>(); 
        for(int i:nums2){
            if(hm.get(i)!=null&&hm.get(i)!=0){
                ar.add(i);
                hm.put(i,hm.get(i)-1);
            }
        }
        int[] ans_ar = new int[ar.size()];
        int idx=0;
        for(int elem:ar){
            ans_ar[idx++]=elem;
        }
        return ans_ar;
    }
}