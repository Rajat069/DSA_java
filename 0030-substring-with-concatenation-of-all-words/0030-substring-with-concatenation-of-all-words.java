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
        HashMap<String, Integer> cpy = new HashMap<>();
        
        for (int i = 0; i < wlen; i++) { // Start the loop from 0 to wlen-1
            int left = i;
            int right = i;
            int count = 0; // Count the number of words matched in the window
            
            while (right + wlen <= s.length()) {
                String nextWord = s.substring(right, right + wlen);
                right += wlen;

                if (hm.containsKey(nextWord)) {
                    cpy.put(nextWord, cpy.getOrDefault(nextWord, 0) + 1);
                    count++;

                    while (cpy.get(nextWord) > hm.getOrDefault(nextWord, 0)) {
                        String firstWord = s.substring(left, left + wlen);
                        cpy.put(firstWord, cpy.get(firstWord) - 1);
                        count--;
                        left += wlen;
                    }

                    if (count == wcount) {
                        sol.add(left);
                    }
                } else {
                    cpy.clear();
                    count = 0;
                    left = right;
                }
            }
            cpy.clear(); // Clear the HashMap after each iteration of the outer loop
        }
        return sol;
    }
}
