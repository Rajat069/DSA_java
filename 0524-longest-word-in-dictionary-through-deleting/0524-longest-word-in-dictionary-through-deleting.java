class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String sol = "~";
        int len = 0;
        for(String word : dictionary) {
            Boolean flag = false;
            int p1=0,p2=0;
            while(p1<s.length()&&p2<word.length()){
                 if(word.charAt(p2)==s.charAt(p1)){
                     p2++;
                 }
                p1++;
            }
            if(p2==word.length()&&len<=word.length()){
                if(len==word.length()&&sol.compareTo(word)>0||len<word.length()){
                    sol=word;
                }
                len=word.length();
            }
        }
        return sol.equals("~")?"":sol;
    }
}
