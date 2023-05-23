class KthLargest {
    ArrayList<Integer>elem=new ArrayList<>();
    int kth;
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
           elem.add(nums[i]);
        }
        kth=k;
    }
    
    public int add(int val) {
        elem.add(val);
        Collections.sort(elem);
        return elem.get(elem.size()-kth);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */