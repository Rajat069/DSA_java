class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
     List<String> word_s = new ArrayList<>(hm.keySet());
             Collections.sort(word_s, (String a, String b) -> {
                int aCount = hm.get(a);
                int bCount = hm.get(b);
            
                // If the counts are equal, then use String.compareTo to lexigraphically compare the strings
                if (aCount == bCount) {
                    return a.compareTo(b);
                } else {  // Else sort by greatest count
                    return bCount - aCount;
                }
            });
        return word_s.subList(0, k);
    }
}