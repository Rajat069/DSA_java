class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<String,HashMap<Character,Integer>>hm = new HashMap<>();
        for(int i=1;i<words.length;i++){
            String word = words[i];
            HashMap<Character,Integer>temp = hm.getOrDefault(word,new HashMap<>());            for(int q=0;q<word.length();q++){
                temp.put(word.charAt(q),temp.getOrDefault(word.charAt(q),0)+1);
            }
            if(!hm.containsKey(word))hm.put(word,temp);
        }
        List<String> sol = new ArrayList<>();
        for(char c:words[0].toCharArray()){
            boolean notPres=false;
            for(int i=1;i<words.length;i++){
                HashMap<Character,Integer>temp = hm.get(words[i]);
                if(temp.containsKey(c)&&temp.get(c)!=0){
                    temp.put(c,temp.get(c)-1);
                }
                else{
                    notPres=true;
                    break;
                }
            }
            if(!notPres)sol.add(c+"");
        }
        return sol;
    }
}