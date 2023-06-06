class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String sol = "~"; //this is bigger then any string that lowercase alphabets can form
        int len = 0;
        for(String word : dictionary) {
            Boolean flag = false;
            int p1=0,p2=0;
            while(p1<s.length()&&p2<word.length()){ //two pointer approach to check wether the order and frequency is same or not
                 if(word.charAt(p2)==s.charAt(p1)){
                     p2++;
                 }
                p1++;
            }
            if(p2==word.length()&&len<=word.length()){ //if p2 reaches end meaning all letters are present
                if(len==word.length()&&sol.compareTo(word)>0||len<word.length()){
                    sol=word; //update only if lexicographically the string is smaller with same length or length is greator
                }
                len=word.length();
            }
        }
        return sol.equals("~")?"":sol; //if no string is matched
    }
}
