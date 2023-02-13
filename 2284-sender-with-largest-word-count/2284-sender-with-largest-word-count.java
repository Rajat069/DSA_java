class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm = new HashMap<>();
        int idx=0;
        for(String name:senders){
            String[] words = messages[idx++].split(" ");
            hm.put(name,hm.getOrDefault(name,0)+words.length);
        }
        String big_name= "";
        int cur_big=0;
        for(String name:hm.keySet()){
            int count=hm.get(name);
            if(cur_big<count){
                cur_big=count;
                big_name=name;
            }
            else if(count==cur_big&&name.compareTo(big_name)>0){
                big_name=name;
            }
        }
        return big_name;
    }
}