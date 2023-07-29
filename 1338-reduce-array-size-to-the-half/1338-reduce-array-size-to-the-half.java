class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        for(int i=0;i<arr.length;i++){
           hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        int cur=0,size=0;
        for(Map.Entry<Integer, Integer> entry : list){
            cur+=entry.getValue();
            if(cur>=arr.length/2)return size+1;
            size++;
        }
        return 0;
    }
}