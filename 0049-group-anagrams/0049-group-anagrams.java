class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String word = String.valueOf(arr);
            if(!hm.containsKey(word))hm.put(word,new ArrayList<>());
            hm.get(word).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}