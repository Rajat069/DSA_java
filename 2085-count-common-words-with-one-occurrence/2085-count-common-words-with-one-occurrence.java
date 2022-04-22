class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
        ArrayList<String> temp = new ArrayList<>();
        for(int i=0;i<words1.length;i++){
            if(search(words1,words1[i])==1){
                   if(!temp.contains(words1[i])&&search(words2,words1[i])==1)count++;
            }
            temp.add(words1[i]);
        }
        for(int i=0;i<words2.length;i++){
            if(search(words2,words2[i])==1){
                   if(!temp.contains(words2[i])&&search(words1,words2[i])==1)count++;
            }
            temp.add(words2[i]);
        }
        return count;
    }
    public int search(String []ar,String s){
        int count =0;
        for(int i=0;i<ar.length;i++){
            if(ar[i].equals(s))count++;
        }
        return count;
    }
}