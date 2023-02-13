class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,1)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int[] ar = new int[k];
        for (int i = 0; i < k; i++) {
            ar[i] = list.get(i).getKey();
        }
        return ar;
    }
}