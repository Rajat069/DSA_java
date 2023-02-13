class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hm = new HashMap<>();
        int idx=0;
        String big_name= "";
        int cur_big=0;
        for(String name:senders){
            String[] words = messages[idx++].split(" ");
            hm.put(name,hm.getOrDefault(name,0)+words.length);
            int count=hm.get(name);
            if(count==cur_big&&big_name.compareTo(name)<0){
                big_name=name;
            }
            else if(cur_big<count){
                cur_big=count;
                big_name=name;
            }
        }
        return big_name;
    }
}