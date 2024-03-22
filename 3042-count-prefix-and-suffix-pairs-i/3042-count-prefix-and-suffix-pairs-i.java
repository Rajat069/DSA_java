class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isSuf(words[i],words[j]))count++;
            }
        }
        return count;
    }
    public boolean isSuf(String w1,String w2){
        if(w1.length()>w2.length())return false;
        return w2.substring(0,w1.length()).contains(w1)&&w2.substring(w2.length()-w1.length()).contains(w1);
    }
}