class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[] s1_ar = s1.split(" ");
        String[] s2_ar = s2.split(" ");
        for(String s:s1_ar){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:s2_ar){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        ArrayList<String> ar= new ArrayList<>();
        for(String s:hm.keySet()){
            if(hm.get(s)==1){
                ar.add(s);
            }
        }
        int idx=0;
        String[] ans_ar = new String[ar.size()];
        for(String s:ar){
            ans_ar[idx++]=s;
        }
        return ans_ar;
    }
}