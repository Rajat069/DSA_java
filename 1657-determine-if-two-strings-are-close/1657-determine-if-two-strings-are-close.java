class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int[]freq1 = new int[26];
        for(char c:hm.keySet()){
            pq1.offer(hm.get(c));
            freq1[c-'a']++;
        }
        hm = new HashMap<>();
        for(int i=0;i<word2.length();i++){
            char c=word2.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:hm.keySet()){
            pq2.offer(hm.get(c));
            freq1[c-'a']--;
        }
        if(pq1.size()!=pq2.size())return false;
         System.out.println('h');
        while(!pq1.isEmpty()){
            int val = pq1.poll();
            int val2 = pq2.poll();
           if(val!=val2)return false;
        }
        for(int i:freq1){
            if(i!=0)return false;
        }
        return true;
    }
}