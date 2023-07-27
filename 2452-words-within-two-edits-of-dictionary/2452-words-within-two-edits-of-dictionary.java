class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> sol = new ArrayList<>();
        for(String words:queries){
            HashSet<String> seen = new HashSet<>();
            for(int i=0;i<dictionary.length;i++){
                String d = dictionary[i];
                int dif=0;
                for(int w=0;w<words.length();w++){
                    if(words.charAt(w)!=d.charAt(w)){
                        dif++;
                    }
                    if(dif>2)break;
                }
                if(dif<=2&&!seen.contains(words)){
                 sol.add(words);
                 seen.add(words);                    
                }
            }
        }
        return sol;
        
    } 
}