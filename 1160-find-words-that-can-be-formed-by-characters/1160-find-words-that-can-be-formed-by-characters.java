class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0; 
        int temp[] = new int[26];
            for(char c:chars.toCharArray()){
                temp[c-'a']++;
            }    
        for(int i=0;i<words.length;i++){
           int check =0; 
           int t[] = Arrays.copyOf(temp, 26);
           for(int j=0;j<words[i].length();j++){
               t[words[i].charAt(j)-'a']--;
           }
            for(int p=0;p<26;p++){
                if(t[p]<0){
                    check++;
                    break;
                }
            }
            if(check==0){
                ans+=words[i].length();
            }
        }
        return ans;
    }
}