class Solution {
    public String frequencySort(String s) {
        HashMap<String,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            if(!hm.containsKey(c+""))hm.put(c+"",1);
            else hm.put(c+"",hm.get(c+"")+1);
        }
       HashMap<String, Integer> temp
            = hm.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i1.getValue().compareTo(
                                  i2.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
 
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,Integer> entry : temp.entrySet()){
            String st = entry.getKey().repeat(entry.getValue());;
            sb.append(st);
        }
        sb.reverse();
        return sb.toString();
    }
}