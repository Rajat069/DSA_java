class Solution {
    public String reversePrefix(String word, char ch) {
        int f = word.indexOf(ch);
        if(f==-1)return word;
        StringBuilder sb = new StringBuilder(word);
        sb.delete(f+1,word.length());
        sb.reverse();
        return sb.toString()+word.substring(f+1);
    }
}