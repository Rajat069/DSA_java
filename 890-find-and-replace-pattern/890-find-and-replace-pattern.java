class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        int[] idxpattern = new int[pattern.length()];
        for(int i=0;i<pattern.length();i++){
            idxpattern[i]=pattern.indexOf(pattern.charAt(i));
        }
        for(int i=0;i<words.length;i++){
            int temp =0;
            for(int j=0;j<words[i].length();j++){
                if(words[i].indexOf(words[i].charAt(j))!=idxpattern[j]){
                    temp++;
                    break;
                }
            }
            if(temp==0)ans.add(words[i]);
        }
        return ans;
    }
}