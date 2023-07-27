class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs = new HashSet<>();
        hs.addAll(wordList);
        if(!hs.contains(endWord))return 0; 
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(beginWord);
        int sol=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int s=0;s<size;s++){
               String ss = queue.poll();
               char[] word = ss.toCharArray();
               for(int i=0;i<ss.length();i++){
                   char org = word[i];
                   for(int as=97;as<=122;as++){
                       char ch = (char)as;
                       if(word[i]==ch)continue;
                       word[i]=ch;
                       String newWord = String.valueOf(word);
                       if(newWord.equals(endWord))return ++sol;
                       if(hs.contains(newWord)){
                           queue.offer(newWord);
                           hs.remove(newWord);
                       }
                   }
                   word[i]=org;
               }   
            }
            sol++;
        }
        return 0;
    }
}