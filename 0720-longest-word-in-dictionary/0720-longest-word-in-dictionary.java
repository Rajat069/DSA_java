class Solution {
    public String longestWord(String[] words) {
        HashSet<String> hs = new HashSet<>();
        for(String s:words){
            hs.add(s);
        }
        String longest = "";
        for(String w:words){
            Boolean flag = true;
            for(int i=0;i<w.length()-1;i++){
                if(!hs.contains(w.substring(0,i+1))){
                    flag=false;
                    break;
                }
            }
            if(flag&&w.length()>=longest.length()){
                if(w.length()==longest.length()){
                    if(w.compareTo(longest)<0)longest=w;
                }
                else longest=w;
            }
        }
        return longest;
    }
}