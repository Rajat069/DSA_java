import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }
        List<Integer> sol = new ArrayList<>();
        int wlen = words[0].length();
        int wcount = words.length;
        
        for (int i = 0; i < s.length()-wlen*wcount+1 ; i++) { // Start the loop from 0 to wlen-1      
            HashMap<String, Integer> cpy = new HashMap<>(hm);
            for(int j=0;j<wcount;j++){
                String w=s.substring(i+j*wlen,i+j*wlen+wlen);
                if(cpy.containsKey(w)){
                    if(cpy.get(w)==1){
                        cpy.remove(w);
                    }
                    else cpy.put(w,cpy.getOrDefault(w,0)-1);
                    if(cpy.isEmpty()){
                      sol.add(i);
                      break;
                   }
                }
                else break;
            }
        }
        return sol;
    }
}
