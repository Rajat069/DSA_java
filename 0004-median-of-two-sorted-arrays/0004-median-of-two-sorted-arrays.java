class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i:nums1){
            ar.add(i);
        }
        for(int j:nums2){
            ar.add(j);
        }
        Collections.sort(ar);
        return ar.size()%2==1?ar.get(ar.size()/2):(ar.get(ar.size()/2)+ar.get(ar.size()/2-1))/2.0;
    }
}