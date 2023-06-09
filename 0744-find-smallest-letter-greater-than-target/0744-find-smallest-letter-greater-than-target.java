class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char sol=letters[0];
        int dif=27;
        for(char c:letters){
            int d=(int)c-(int)target;
            if(d<dif&&c>target){
                dif=d;
                sol=c;
            }
        }
        return sol;
    }
}