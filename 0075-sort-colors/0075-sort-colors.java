class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int idx=0;
        for(int key:hm.keySet()){
            int freq=hm.get(key);
            while(freq!=0){
                nums[idx++]=key;
                freq--;
            }
        }
    }
}